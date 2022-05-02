
public class IntegerNode {
	
	private int data;
	private IntegerNode next;
	
	public IntegerNode() {
		
// default constructor which sets data to 0, and next to null
		
		data = 0;
		next = null;
		
	}

	public IntegerNode(int data) {
		
// overloaded constructor which passes data parameter
		
		setData(data);
		next = null;
	}
	
	public int getData() {
		
// accessor for data, returns value of node
		
		return data;
	}
	
	public IntegerNode getNext() {
		
// accessor for next, returns the reference to NEXT node
		
		return next;
	}
	
	public IntegerNode setData(int data) {
		
// mutator for data, parameter data. Provides a return reference to this object
		
		this.data = data;
		return this;
	}
	
	public IntegerNode setNext (IntegerNode next) {
		
// mutator for next, parameter new value for next. Returns reference to this object
		
		this.next = next;
		return this;
	}
}
