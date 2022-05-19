
public class RecursiveLinkedList<T> {
	
	private T first;
	private RecursiveLinkedList<T> rest;
	
	public RecursiveLinkedList() {
		
// We declare the two instance variables above. first represents the first T object in the list, 
// and rest represents the rest of the list, which is a RecursiveLinkedList object reference itself. 
// We coded the default constructor, which constructs an empty list
		
		first = null;
		rest = null;
	}

	public void insert (T item) {
		
// After insertion, first will be the method’s T parameter item, and rest will be the list before 
// we inserted item. We begin by testing if the list is empty by calling the isEmpty method, which 
// returns true if first is null.
		
		if (isEmpty()) {	// is list empty?
			
// If the list is empty, we assign item to first
			
			first = item;
			
		}
		
// If first is not null, we copy the current list into a new list. We instantiate a temporary list, 
// tempList. We then assign first to the first instance variable of tempList and rest to the rest 
// instance variable of tempList.
		
		else {
			
			RecursiveLinkedList<T> tempList = new RecursiveLinkedList<T>();
			tempList.first = first;
			tempList.rest = rest;
			first = item;
			rest = tempList;
			
// At that point, we have copied the current list into tempList. Now we can insert the new item 
// into the first position and make tempList the rest of the list
			
		}
	}
	
// The recursive delete method takes the T parameter item. If the list is empty, we return false.	
// If the list is not empty, then first is not null, and we can call the equals method on first. 
// More generally, when processing a recursively designed list, not testing for all the base case 
// conditions could result in a NullPointerException.	
	
	public boolean delete (T item) {
		if (isEmpty()) {		
			return false;
		}
		
// If the list is not empty and first is equal to item, we do the necessary bookkeeping on the list 
// to delete the first element before returning true. In order to delete the first element of the 
// list, we need to update first and rest. First will be assigned the first element of rest. However, 
// rest could be null, in which case rest does not have a first element. 
		
		else if (first.equals(item)) {	
			T temp = first;
			
// Thus, we test if rest is null. If it is, the list is now empty, so we assign null to first. 
// If rest is not null, we assign the first element of rest to first, and we assign the rest of 
// rest to rest.
			
			if(rest == null) {
				first = null;
			}
			
			else {		// rest not null
				first = rest.first;
				rest = rest.rest;
			}
			
			return true;
		}
		
		else if (rest == null) {
			return false;	
		}						// try to delete in rest
		
		else {		
			
		}
		
// Finally, if the list is not null and the first is not equal to item, we skip and test if rest 
// is null. If it is, we cannot delete and return false. If rest is not null, we make the recursive 
// call to try to delete from rest.
		
			return rest.delete(item);
			
			}
		
	public boolean isEmpty() {
			return (first == null);
		}
		
// We coded our toString method, which is also recursive. If the list is empty, it returns the empty
// String. If the list is not empty, we assign the contents of first to the temporary variable listString
	
	@Override
	public String toString() {
			
			String listString = "";
			if (first != null) {
				listString = first.toString() + "\n";
			}
			
// Note that the class the client specifies as the type of the RecursiveLinkedList will need to 
// provide an overriding toString method. We then need to traverse rest in order to add its contents 
// to listString. But rest could be null, in which case we are finished traversing the list. So if 
// rest is not null, we traverse rest by making the recursive call:
			
			if (rest != null) {
				listString += rest.toString();
			}
			
			return listString;
	}
}
