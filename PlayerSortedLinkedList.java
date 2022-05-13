
public class PlayerSortedLinkedList extends ShellLinkedList {
	
// Due to extending the ShellLinkedList, head & numberOfItems are inherited instance variables
	
	public PlayerSortedLinkedList() {
		
		super();
	}

// The insert method, inserts a node containing its Player parameter p.
	
	public void insert (Player p) {
		
		PlayerNode pn = new PlayerNode(p);
		
// Declares and instantiates a PlayerNode object, called pn, which we will insert in the 
// linked list. To get ready to search for the insertion point for the new Player, we declare 
// two PlayerNode object references, current and previous, and assign them head and null.
			
		PlayerNode current = head;
		PlayerNode previous = null;
		
// We use current to traverse the list, going just past the point of insertion, and we use 
// previous to track the node just before current. We will insert pn between previous and current. 
		
		while(current != null && current.getPlayer().getId() < p.getId()) {
			
// We construct our while loop condition so that we will exit the loop if the list is empty 
// or if we have reached the end of the list (we test if current is null), or if we are 
// visiting a node containing a Player whose id is larger than or equal to the id value of p, 
// the Player parameter of the insert method.
			
			previous = current;
			current = current.getNext();
		}
		
// We test if previous is null, in which case we never entered the while loop because the list 
// is empty or because the head node contains a Player whose id value is greater than p’s id.
		
		if(previous == null) {	// insert as head
			pn.setNext(head);
			head = pn;
		}
		
// If previous is not null, we will insert in the middle of the list or at the end of the list. 
// To insert the node pn between previous and current, we connect pn to current, and previous to pn.
		
		else {
			
			pn.setNext(current);
			previous.setNext(pn);
		}
		
		numberOfItems++;
	}
	
// The delete method is very similar to the delete method of the PlayerLinkedList class. We 
// first test if the id of the Player at current is greater than searchID. If that is true, 
// we have no chance of finding a Player object with an id of searchID since the list is  
// sorted in ascending order. Therefore, we throw a DataStructureException with an appropriate 
// message, and we exit the method.
	
	public Player delete(int searchID) throws DataStructureException {
		
		PlayerNode current = head;
		PlayerNode previous = null;

		while(current != null && current.getPlayer().getId() != searchID) {
			
			if(current.getPlayer().getId() > searchID) {
				
				throw new DataStructureException (searchID + " not found: cannot be deleted.");
			}
			
			 previous = current;
			 current = current.getNext( );
			
			}
			
			if (current == null) {	// not found
				throw new DataStructureException (searchID + " not found: cannot be deleted");
			}
			
			else {		// searchID found at Player at node current
				
				if(current == head) {
					head = head.getNext();	// delete head
				}
				
				else {
					
					previous.setNext(current).getNext();
				
				numberOfItems--;
			}
				return current.getPlayer();
			}
}
}