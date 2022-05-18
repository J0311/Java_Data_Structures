// Generic node class for Data Structures


public class Node<T> {
	
	private T data;
	private Node<T> next;
	
// Default constructor sets data & next to null
	
	public Node() {
		
		data = null;
		next = null;
	}
	
// Constructor with data parameter
	
	public Node(T data) {
		
		setData(data);
		next = null;
	}
	
// Accessor for data
	
	public T getData() {
		
		return data;
	}
	
// Accessor for next
	
	public Node<T> getNext(){
		
		return next;
	}
	
// Mutator for data
	
	public Node setData(T data) {
		
		this.data = data;
		return next;
	}
	
// Mutator for next
	
	public Node setNext(Node<T> next) {
		
		this.next = next;
		return this;
	}

}