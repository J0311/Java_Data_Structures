// Queue implementation of Linked List

public class PlayerQueueLinkedList extends ShellLinkedList {
	
	private PlayerNode tail;	// last node
	
	public PlayerQueueLinkedList() {
		
//The constructor, calls the constructor of the superclass, and because it constructs 
// an empty list, sets tail to null.
		
		super();
		tail = null;
	}
	
// The enqueue method, inserts an item at the end of the list. We first instantiate a 
// PlayerNode object reference named pn, using the parameter Player p of the enqueue method.
	
	public void enqueue (Player p) {
		
		// insert as tail
		
		PlayerNode pn = new PlayerNode(p);
		
// Because we insert at the end of the list, we must properly handle the case when the 
// queue is empty, in which case tail is null. We test if the queue is empty. If it is, 
// we assign pn to head and tail. After we execute these two lines, the queue contains 
// one element, and that element is both the first and last item in the queue.
		
		if(isEmpty()) {
			
			tail = pn;
			head = pn;
		}
		
// If the list is not empty, we attach pn at the end of the list by setting the next 
// instance variable of tail to pn. We then assign pn to tail in order to reflect that 
// pn is now the last node of the list. Finally, and in all cases (empty list or not), 
// we increment numberOfItems by 1.
		
		else {
			
			tail.setNext(pn);
			tail = pn;
		}
		
		numberOfItems++;
	}
	
// Dequeue method
	
	public Player dequeue() throws DataStructureException {
		
		if(isEmpty()) {
			
			throw new DataStructureException("empty queue: cannot dequeue");
		}
		
		else {
			
			Player deleted = head.getPlayer();
			head = head.getNext();
			if(--numberOfItems == 0) {
				tail = null;
			}
			
			return deleted;
			
			}
		}
	
// The peek method is identical to the peek method of our PlayerStackLinkedList 
// class, except for the message passed to the DataStructureException constructor.
	
	public Player peek()throws DataStructureException{
		
		if(isEmpty()) {
			
			throw new DataStructureException("empty queue: cannot peek");
		}
		
		else {
			
			return head.getPlayer();	
		}
		}
	}
