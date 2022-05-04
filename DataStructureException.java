// Generating out own exception class for data structures

import java.util.NoSuchElementException;


public class DataStructureException extends NoSuchElementException {
	
// constructor - s/String error message
	
	public DataStructureException (String s) {
		super(s);
	}

}
