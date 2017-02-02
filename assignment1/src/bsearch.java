
public class bsearch {
	public boolean binary_search(int a[], int b) {
		if (a.length == 0) {
			return false;
		}
		int low = 0;
		int high = a.length-1;
		if (low<=high) {
			int middle = (low+high)/2;
			if (b==a[middle]) {
				return true;
			}
			if (b<a[middle]) {
				int[] al = new int[middle-low];
				for (int i=0; i<middle; i++) {
					al[i] = a[i];
				}
				return this.binary_search(al, b);
			}
			if (b>a[middle]) {
				int[] ah = new int[high-middle];
				for (int i=0; i<high-middle; i++) {
					ah[i] = a[middle+1+i];
				}
				return this.binary_search(ah, b);
			}
		}
		return false;
	}

}
