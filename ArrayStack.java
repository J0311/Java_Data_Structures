
public class ArrayStack {

	private static final int STACK_SIZE = 100; // maximum array size
	private Player[] stack; // array of Player objects
	private int top; // last used index; top o the stack
	
	
// Stack is an array of Players. STACK_SIZE is the size of the array stack. 
// Top represents the index of the element of the array stack that is at the 
// top of the stack. The value of top will vary from –1 (when the stack is empty) 
// to STACK_SIZE – 1 (when the stack is full).

	public ArrayStack() {
		
// In this default constructor, we instantiate stack and then set top to −1, which 
// indicates that the stack is empty. When a client program pushes the first Player onto the stack, top will be incremented, so that the top of the stack will be the array element at index 0.

		stack = new Player[STACK_SIZE];
		top = -1; // stack is empty
	}

// The push method returns true if the stack is not full before we insert, and false 
// if it is, in which case we cannot insert. We test if the stack is not full. If it 
// is not full, we use the prefix auto-increment operator to combine two operations: 
// first increment top by 1, then assign p, the Player parameter of the push method, 
// to the element at index top.

	public boolean push(Player p) {
		if (!isFull()) // is there room to insert?
		{
			stack[++top] = p;
			return true;
			
		} else {
			
			return false;
		}
	}

// The pop method attempts to delete and return a Player object from the top of the 
// stack. The method throws a DataStructureException if the stack is empty, in which 
// case we cannot pop. If it is not empty, we use the postfix auto-decrement operator 
// to combine two operations: first return the Player stored at index top in the array 
// stack, then decrement top by 1.
	
	public Player pop() throws DataStructureException {
		
		if (!isEmpty()) {// is there an item to delete?
			return stack[top--];
		}
		else {
			
			throw new DataStructureException("Stack empty: cannot pop");
		}
	}

// The peek method is similar to pop, except that it does not delete from the stack and 
// it returns the element at the top of the stack. Again, this enables the client to 
// directly update that object in the stack
	
	public Player peek() throws DataStructureException {
		if (!isEmpty()) {// stack is not empty
			
			return stack[top];
		}
		else {
			throw new DataStructureException("Stack empty: cannot peek");
		}
	}

// isEmpty method
	
	public boolean isEmpty() {
		return (top == -1);
	}

// isFull method
	
	public boolean isFull() {
		return (top == (STACK_SIZE - 1));
	}

// returns a String representation of the contents of the stack. Note that in that 
// method, we loop from top to 0, not from STACK_SIZE – 1 to 0.
	
	@Override
	public String toString() {
		String stackString = "";
		
		for (int i = top; i >= 0; i--) {
			stackString += (i + ": " + stack[i] + "\n");
		}
		return stackString;

	}
}
