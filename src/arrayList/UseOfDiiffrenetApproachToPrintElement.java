package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UseOfDiiffrenetApproachToPrintElement {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Numan");
		arrayList.add("Niyaz");
		arrayList.add("Nazif");
		arrayList.add("Nafiz");
		arrayList.add("Muna");
		arrayList.add("Nazifa");
		arrayList.add("Nazia");

		System.out.println("\nusing for each loop\n");
		// using for each loop
		for (String a : arrayList) {
			System.out.println(a + " ");
		}
		System.out.println("\nusing each loop\n");

		// using for loop
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		// iterator()----this is a method available in collection--it will return
		// Iterator type
		System.out.println("\nby using for while loop**+ iterator()********\n");

		Iterator<String> iterator = arrayList.iterator();// iterator() will return Iterator type obj
		while (iterator.hasNext()) {// hasNext() method in Iterator will confirms next elements is available
			System.out.println(iterator.next());// next() methos in Iterator will get the next element
		}
		System.out.println("\nBy using forEach() method we get all elements**********\n");
		// from java 1.8 this method is added in collection (in iterable interface
		// we are passing Consumer obj by using Lambda express
		arrayList.forEach(n->System.out.println(n)); 
		

	}

}
