import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Collection & Generics
// Dynamic arrays

public class Collection_Generics {

	public static void main(String[] args) throws Exception {

		// int values[] = new int[4];

		// In this object array, we can have ANY data type of value

		Object values1[] = new Object[4];
		values1[0] = "Navin";
		values1[1] = 7;

		// Collection is the COLLECTION OF OBJECTS

		Collection values = new ArrayList<>();
		values.add(3);
		values.add("Joseph");
		values.add(5.8f);
		values.add(77);
		
		// Stream API which uses a Lambda Expression to print all elements:
		
		values.forEach(System.out::println);

		// This Collection is the collection of INTEGERS

		Collection<Integer> num = new ArrayList<>();
		num.add(4);
		num.add(7);
		num.add(98);
		num.add(33);

		// Enhanced for loop to print out Integer list:

		for (Integer n : num) {
			System.out.println(n);
		}

		// We can use an iterator OR enhance for loop to print values

		// Create an Iterator object, then use the Iterator object to call
		// the .next() method, which displays next item in collection:

		Iterator i = values.iterator();

//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());

		// OR for more concise code, utilize a while loop which allows "i" to
		// call the .hasNext() method:

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		for (Object stuff : values) {
			System.out.println(stuff);
		}

	}
}
