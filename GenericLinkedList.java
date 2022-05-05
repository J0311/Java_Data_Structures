// EXTENDS ShellLinkedList under the assumption ShellLinkedList utilized
// the identifier <T>

public class GenericLinkedList<T> extends ShellLinkedList {
	
// head & numberOfItmes are inherited instance variables
	
	public GenericLinkedList() {
		
		super();
	}

	public void insert(T item) {
		
		// insert as head
		
		Node<T> nd = new Node<T>(item);
		nd.setNext(head);
		head = nd;
		numberOfItems++;
	}
	
	public boolean delete(T item) {
		
		Node<T> current = head;
		Node<T> previous = null;
		while( current != null && ! (item.equals(current.getData()))) {
			previous = current;
			current = current.getNext();
			
		}
		
		if (current == null) { // not found
			return false;
		}
		
		else {
			if (current == head) {
				head = head.getNext();	// delete head
			}
			
			else {
				previous.setNext(current).getNext();
			
			
			numberOfItems--;
			return true;
			}
		}
	}
}
