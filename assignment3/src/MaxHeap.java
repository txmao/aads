import java.util.ArrayList;

public class MaxHeap {
	private ArrayList<Integer> hpList = new ArrayList<Integer>();
	
	//initialize, the length is 0
	public MaxHeap() {
		hpList.add(0);
	}
	
	public void clear_heap() {
		ArrayList<Integer> nlist = new ArrayList<Integer>();
		hpList = nlist;
		hpList.add(0);
	}
	
	//method 1: insert the whole list a[], and floyd method to construct heap
	public void heapify(ArrayList<Integer> a){
		int a_len = a.size();
		hpList.set(0, a_len);
		hpList.addAll(a);
		//
		int f_par = hpList.get(0)/2;
		while (f_par>0) {
			floyd(f_par);
			f_par = f_par-1;
		}
	}
	
	//method 1: using floyd method to construct heap
	public void floyd(int f_par) {
		int c_par = f_par;
		int l_c = c_par*2;
		int r_c = l_c + 1;
		int end = hpList.get(0);
		while (c_par*2<=end) {
			if (r_c>end) {
				if (hpList.get(c_par)<hpList.get(l_c)) {
					int l_c_value = hpList.get(l_c);
					int c_par_value = hpList.get(c_par);
					hpList.set(c_par, l_c_value);
					hpList.set(l_c, c_par_value);
					c_par = l_c;
					l_c = c_par*2;
					r_c = c_par*2 + 1;
				} else {
					c_par = end;
				}
			} else{
				if (hpList.get(l_c)>hpList.get(r_c) && hpList.get(l_c)>hpList.get(c_par)) {
					int l_c_value = hpList.get(l_c);
					int c_par_value = hpList.get(c_par);
					hpList.set(c_par, l_c_value);
					hpList.set(l_c, c_par_value);
					c_par = l_c;
					l_c = c_par*2;
					r_c = c_par*2 + 1;
				} else {
					if (hpList.get(r_c)>hpList.get(l_c) && hpList.get(r_c)>hpList.get(c_par)) {
						int r_c_value = hpList.get(r_c);
						int c_par_value = hpList.get(c_par);
						hpList.set(c_par, r_c_value);
						hpList.set(r_c, c_par_value);
						c_par = r_c;
						l_c = c_par*2;
						r_c = c_par*2 + 1;
					} else {
						c_par=end;
					}
				}
			}
		}
	}
	
	//method 2: insert one by one, please use method 1 above, this is just for a verification of the method 1
	public void insertHeap(int a) {
		if (!hpList.contains(a)) {
			hpList.set(0, hpList.get(0)+1);
			hpList.add(a);
			int ins_pos = hpList.get(0);
			int par_pos = ins_pos/2;
			percoUp(ins_pos, par_pos);
		}
	}
	
	//method 2: make it a heap, percolate up
	public void percoUp(int ins_pos, int par_pos) {
		int ins_value = hpList.get(ins_pos);
		if (par_pos>0) {
			int par_value = hpList.get(par_pos);
			if (par_value < ins_value) {
				hpList.set(par_pos, ins_value);
				hpList.set(ins_pos, par_value);
				ins_pos = par_pos;
				par_pos = par_pos/2;
				percoUp(ins_pos, par_pos);
			}
		}
	}
	
	//print the heap, note that the first position recorded the size of heap
	public void printHeap(){
		int lenhp = hpList.size();
		ArrayList<Integer> prtLst = new ArrayList<Integer>();
		for (int i=1; i<lenhp; i++) {
			prtLst.add(hpList.get(i));
		}
		System.out.println(prtLst);
	}
	
	//heap sort
	public ArrayList<Integer> heapSort() {
		ArrayList<Integer> cplist = hpList;
		if (cplist.size()<2) {
			cplist.remove(0);
		} else {
			while (cplist.get(0)>1) {
				int e_pos = cplist.get(0);
				//value swap
				int e_val = cplist.get(e_pos);
				int s_val = cplist.get(1);
				cplist.set(1, e_val);
				cplist.set(e_pos, s_val);
				//index -1
				cplist.set(0, cplist.get(0)-1);
				//percolate down
				cplist = percoDown(cplist);
			}
			cplist.remove(0);
		}
		return cplist;
	}
	
	//for sorting : percolate down
	private ArrayList<Integer> percoDown(ArrayList<Integer> cplist) {
		int end_ind = cplist.get(0);
		int cur_pos = 1;
		while (cur_pos*2 <= end_ind) {
			int p1_pos = cur_pos*2;
			int p2_pos = p1_pos+1;
			if (p2_pos>end_ind) {
				int v0 = cplist.get(cur_pos);
				int v1 = cplist.get(p1_pos);
				if (v1>v0) {
					cplist.set(cur_pos, v1);
					cplist.set(p1_pos, v0);
					cur_pos = p1_pos;
				} else {
					break;
				}
			} else {
				int v0 = cplist.get(cur_pos);
				int v1 = cplist.get(p1_pos);
				int v2 = cplist.get(p2_pos);
				if (v1>v0 && v1>v2) {
					cplist.set(cur_pos, v1);
					cplist.set(p1_pos, v0);
					cur_pos = p1_pos;
				} else {
					if (v2>v0 && v2>v1) {
						cplist.set(cur_pos, v2);
						cplist.set(p2_pos, v0);
						cur_pos = p2_pos;
					} else {
						break;
					}
				}
			}
		}
		return cplist;
	}

}
