import java.util.Arrays;

public class test {
	public static void main(String args[]) {
		System.out.println("### Selection Sort on Single Linked List Test ###");
		sllist lst = new sllist();
		//random generate test list
		java.util.Random r=new java.util.Random();
		for(int i=0;i<10;i++){
			lst.insertf(r.nextInt(20));
		}
		System.out.print("List before sorting: ");
		lst.prtlist();
		lst.slsort();
		System.out.print("List after sorting:  ");
		lst.prtlist();
		
		System.out.println();
		System.out.println("### Recursive Binary Search Test ###");
		int[] a15 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] a16 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int b1 = 9;
		int b0 = 19;
		bsearch bs = new bsearch();
		//length 15
		System.out.print("Array of 15 sorted numbers: ");
		System.out.println(Arrays.toString(a15));
		System.out.print(b1);
		System.out.print(" is inside ? ");
		System.out.println(bs.binary_search(a15, b1));
		System.out.print(b0);
		System.out.print(" is inside ? ");
		System.out.println(bs.binary_search(a15, b0));
		//length 16
		System.out.print("Array of 15 sorted numbers: ");
		System.out.println(Arrays.toString(a16));
		System.out.print(b1);
		System.out.print(" is inside ? ");
		System.out.println(bs.binary_search(a16, b1));
		System.out.print(b0);
		System.out.print(" is inside ? ");
		System.out.println(bs.binary_search(a16, b0));
		
	}

}
