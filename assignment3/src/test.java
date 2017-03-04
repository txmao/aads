import java.util.ArrayList;

public class test {
	public static void main(String args[]) {
		ArrayList<Integer> tlist = new ArrayList<Integer>();
		int[] b = {18, 65, 9, 8, 23, 96, 99, 83, 77, 67, 36, 45, 54, 66, 69, 68};
		for(int i=0; i<b.length; i++){
			tlist.add(b[i]);
		}
		System.out.println("original input sequency");
		System.out.println(tlist);
		
		MaxHeap mhp = new MaxHeap();
		
		mhp.heapify(tlist);
		System.out.println("after heapify");
		mhp.printHeap();
		
		System.out.println("after heap sort");
		ArrayList<Integer> rl = mhp.heapSort();
		System.out.println(rl);
	}

}
