
public class IntegerLinkedList {
	
	private IntegerNode head;
	private int numberOfItems;
	
	
// default constructor/ constructs an EMPTY list
	
	public IntegerLinkedList() {
				
		head = null;
		numberOfItems = 0;
	}
	
// accessor for numberOfItems

	public int getNumberOfItems() {
				
		return numberOfItems;
	}
	
// insert method:
	
	public void insert (int value) {
		IntegerNode nd = new IntegerNode(value);
		nd.setNext(head);
		head = nd;
		numberOfItems++;
	}
	
// delete method: parameter is value to be deleted
// returns "true" if value was deleted from the list, "false" if otherwise
	
	public boolean delete(int value) {
		
// We declare and initialize two IntegerNode references, which we will use to track 
// the current and previous nodes as we traverse the list. Because each node points 
// only to the next node in the list, we can traverse the list in a forward direction only.
		
		IntegerNode current = head;
		IntegerNode previous = null;
		
// Using a while loop, we walk through, or traverse, the list searching 
// for a node containing value, our delete method’s parameter.
		
		while(current != null && current.getData() != value) {
			
// We update previous and current by assigning current to previous, then moving current 
// to the next node in the list by calling the getNext method.
			
			previous = current;
			current = current.getNext();
		}
		
// We test whether current is null, because a null value indicates that we exited the while 
// loop because the list is empty or we reached the end of the list without finding value. 
// Either way, the deletion is unsuccessful and we return false
		
		if(current == null) {	// not found
			return false;
		}
		
		else {
			
			if (current == head) {
				
				head = head.getNext();	// delete head
			}
			
			else {
				
// Once we find value, we will connect previous to the IntegerNode after current. If we have 
// reached the end of the list—that is, current is null —or if we have found value, we are ready 
// to either return false or delete the node by updating the links in our list. At that point, we 
// exit the while loop
				
				previous.setNext(current.getNext());
			}
			
			numberOfItems--;
			return true;
			
			}
		}
	
// toString method
	
	@Override
	public String toString() {
		String listString = "";
		IntegerNode current = head;
		for (int i = 0; i < numberOfItems; i++) {
			listString += current.getData() + " ";
			current = current.getNext();
		}
		
		 return listString;
	}

}
