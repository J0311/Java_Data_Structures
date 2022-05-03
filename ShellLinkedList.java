// Our abstract ShellLinkedList class. This class defines methods that will be common 
// to all subclasses. For example, in addition to the default constructor and the 
// accessor for the number of items in the list, we provide a method to determine whether 
// the list is empty and a toString method that can be used to print each node in the 
// list. We declare both instance variables as protected so that our linked-list 
// subclasses inherit the head and number of items in the list.


public abstract class ShellLinkedList {

	protected PlayerNode head;
	protected int numberOfItems;
	
// default constructor
	
	public ShellLinkedList() {
		
		head = null;
		numberOfItems = 0;
	}
	
// Accessor for numberOfItems
	
	public int getNumberOfItems() {
		return numberOfItems;
	}
	
// isEmpty method - returns true IF no items in list
// false otherwise
	
	public boolean isEmpty() {
		return (numberOfItems == 0);
			
		}
	
// toString method
	
	public String toString() {
		String listString = "";
		PlayerNode current = head;
		while(current != null) {
			listString += current.getPlayer().toString() + "\n";
			current = current.getNext();
		}
		
		return listString;
	}
}
