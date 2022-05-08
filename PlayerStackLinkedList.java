// Stack implementation of Linked List


public class PlayerStackLinkedList extends ShellLinkedList {
	
// head & numberOfItems are inherited instance variables
	
	public PlayerStackLinkedList() {
		super();
	}

// Push Method (insertion)
	
	public void push(Player p) {
		PlayerNode pn = new PlayerNode(p);
		pn.setNext(head);
		head = pn;
		numberOfItems++;
	}
	
// Pop method (deletion)
	
	public Player pop() throws DataStructureException {
		
		if (isEmpty()) {
			
// In the pop method, we first test if the stack is empty. If it is empty, we throw a 
// DataStructureException with the appropriate argument
			
			throw new DataStructureException ("empty stack: cannot be popped");
		}
		
		else { 
			
// If the stack is not empty, we delete the first item in the stack and return it. 
// We call the getPlayer method from the PlayerNode class to get the Player stored 
// at the head of the stack, and assign it to the Player reference deleted. The deleted 
// reference is then returned. Afterwards, we perform the bookkeeping on the stack to 
// reflect the deletion. We update head and decrement numberOfItems.
			
			Player deleted = head.getPlayer();
			head = head.getNext();
			numberOfItems--;
			return deleted;
		}
	}
	
// Peek method
	
	public Player peek()throws DataStructureException{
		
// If the list is empty, we throw an exception. If the list is not empty, we return 
// the Player at the head of the list
		
		if(isEmpty()) {
			
			throw new DataStructureException ("empty stack: cannot peek");
		}
		
	else {
		
		return head.getPlayer();
		
		}
		
		}
	}

