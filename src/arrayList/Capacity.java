package arrayList;

import java.util.ArrayList;

public class Capacity {

	public static void main(String[] args) {
		// when we create arrayLiat obj by calling default constructor---it will give
		// you 10 capacity
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(7);
		arrayList.add(5);
		arrayList.add(8);
		arrayList.add(7);
		arrayList.add(6);
		arrayList.add(13);
		arrayList.add(74);

		// Note-once we occupied all 10 indexes it will automatically increase capacity
		// --will be then 10+5=15
		// if we remove and reduced to 10 or less then again capacity will be 10 only
		
		// when we create arrayLiat obj by calling parameterized constructor---it will
		// give you <passing value> capacity
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>(18);// it will create 18 capacity
		arrayList1.add(5);
	}

}
