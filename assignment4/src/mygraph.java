import java.util.LinkedList;
import java.util.Queue;

public class mygraph {
	public int vetnum;
	public String[] vetexes;
	public String[] edges;
	public int[][] incimat;
	public boolean isdir;
	
	public boolean[] vflag;
	
	public mygraph(int vn, String[] v, String[] e, int[][] im, boolean idr){
		vetnum = vn;
		vetexes = v;
		edges = e;
		incimat = im;
		isdir = idr;
	}
	
	public void myDFS(){
		vflag = new boolean[vetnum];
		for (int i=0; i<vetnum; i++) {
			if (vflag[i]==false) {
				myDFSi(i);
			}
		}
		System.out.println();
	}
	
	public void myDFSi(int i) {
		vflag[i] = true;
		System.out.print(vetexes[i]+" ");
		for (int j=0; j<vetnum; j++) {
			if (vflag[j]==false) {
				for (int h=0; h<edges.length; h++) {
					if (isdir==false) {
						if (incimat[i][h]==1 && incimat[j][h]==1) {
							myDFSi(j);
						}
					}
					if (isdir==true) {
						if (incimat[i][h]==-1 && incimat[j][h]==1) {
							myDFSi(j);
						}
					}
				}
			}
		}
	}
	
	public void myBFS(){
		vflag = new boolean[vetnum];
		Queue<Integer> leftvet = new LinkedList<Integer>();
		for (int i=0; i<vetnum; i++) {
			if (vflag[i]==false) {
				vflag[i] = true;
				System.out.print(vetexes[i] + " ");
				leftvet.add(i);
				while(!leftvet.isEmpty()) {
					int k = leftvet.poll();
					for (int j=0; j<vetnum; j++) {
						for (int h=0; h<edges.length; h++) {
							if (isdir==false) {
								if (vflag[j]==false && incimat[k][h]==1 && incimat[j][h]==1) {
									vflag[j] = true;
									System.out.print(vetexes[j] + " ");
									leftvet.add(j);
								}
							}
							if (isdir==true) {
								if (vflag[j]==false && incimat[k][h]==-1 && incimat[j][h]==1) {
									vflag[j] = true;
									System.out.print(vetexes[j] + " ");
									leftvet.add(j);
								}
							}
						}
					}
				}
			}
		}
		System.out.println();
	}

}
