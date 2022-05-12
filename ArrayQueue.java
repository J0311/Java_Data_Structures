
public class ArrayQueue {
	
	private static final int QUEUE_SIZE = 8;
	private Player [] queue;
	private int front;
	private int back;
	private int numberOfItems;
	
	
// In the constructor, we instantiate the array queue, set front to 0, back to 
// QUEUE_SIZE – 1, and numberOfItems to 0. When the first element is inserted in the 
// queue, back will be increased by 1 modulo QUEUE_SIZE and its value will become 0
	
	public ArrayQueue() { 
		
	
		queue = new Player[QUEUE_SIZE];
		front = 0;
		back = QUEUE_SIZE - 1;
		numberOfItems = 0;
	}
	
// The isFull and isEmpty methods, enable a client program to check if the queue is full 
// or empty before enqueueing or dequeueing a Player. Our enqueue, dequeue, and toString 
// methods also call these methods.
	
	public boolean isFull() {
		return (numberOfItems == QUEUE_SIZE);
		
	}

	public boolean isEmpty() {
		return (numberOfItems == 0);
	}
	
// In the enqueue method, we attempt to insert a Player into the queue. The enqueue 
// method returns false if the queue is full to indicate that we cannot insert. If 
// the queue is not full, we place the Player at the back of the queue, update back 
// accordingly, increment the number of items, and return true.
	
	public boolean enqueue (Player p) {
		
		if(!isFull()) {
			queue [(back + 1) % QUEUE_SIZE] = p;
			back = (back + 1) % QUEUE_SIZE;
			numberOfItems++;
			return true;
		}
		
		else {
			
			return false;
		}
		
		}
		
// In the dequeue method, we attempt to delete and return a Player from the front of the 
// queue. The method throws a Data StructureException if the queue is empty, in which case 
// there are no Players to delete. If the queue is not empty, we update front, decrement 
// the number of items, and return the Player that was at the front of the queue. Note 
// that we add QUEUE_SIZE to the expression front + 1 to guarantee that it will be nonnegative.
		
	public Player dequeue() throws DataStructureException {
		
		if (!isEmpty()) {
			
			front = (front + 1) % QUEUE_SIZE;
			numberOfItems--;
			return queue[(QUEUE_SIZE + front - 1) % QUEUE_SIZE];
		}
		
		else {
			
			throw new DataStructureException ("Queue empty: cannot dequeue");
		}
	}
	
// The toString method, is slightly different from the toString methods we have written 
// so far. Since we know that there are numberOfItems items in the queue and that the 
// first item is at index front, we can simply start at front and loop numberOfItems times 
// to build our String representation of the queue. Depending on how many items are in 
// the queue and the value of front, the looping variable could get larger than 
// QUEUE_SIZE − 1, so we use the modulus operator to make sure we have a valid index
	
		@Override
		public String toString() {
			String queueString = "";
			for (int i = front; i < front + numberOfItems; i++) {
				queueString += queue[i % QUEUE_SIZE].toString() + "\n";
			}
				return queueString;
				
			}
		}