package arrayList;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(11);
		arrayList.add(12);
		arrayList.add(13);
		arrayList.add(14);
		//how we can print---by using get()
		System.out.println(arrayList.get(1));
		//how we can check size of the arrayList---by using size()
		System.out.println(arrayList.size());
		
		

	}

}
