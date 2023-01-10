package arrayList;

import java.util.ArrayList;

public class UseOfHetrogenious {

	public static void main(String[] args) {
		// adding Hetroginious type element

		ArrayList<Comparable> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add("Numan");
		arrayList.add('M');
		arrayList.add(false);
		arrayList.add(true);

		// if we make generic then
		ArrayList<String> arrayList1 = new ArrayList<>();
		arrayList1.add("Sohag");
		arrayList1.add("Sonia");
		arrayList1.add("Nabeel");
		arrayList1.add("Dakpa");
		// arrayList1.add('c'); //we cant do it---only String

		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(5);
		arrayList2.add(15);
		arrayList2.add(25);
		// arrayList2.add(25.5);//not possible

	}

}
