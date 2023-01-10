package arrayList;

import java.util.ArrayList;

public class Implemention {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(11);
		arrayList.add(12);
		arrayList.add(13);
		arrayList.add(14);
		arrayList.add(15);
		
		for(int i:arrayList) {
			System.out.println(i);
		}
		
		System.out.println("*******adding element explicitly in a specicif position*********");
		arrayList.add(0, 15);
		arrayList.add(1, 14);
		arrayList.add(2, 13);
		arrayList.add(3, 12);
		arrayList.add(4, 11);
		arrayList.add(5, 10);
		
		for (int i:arrayList) {
			System.out.println(i);
		}

	}

}
