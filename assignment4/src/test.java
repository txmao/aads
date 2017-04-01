
public class test {
	public static void main(String args[]){
		//undirected connected
		System.out.println("--- test undirected connected graph ---");
		int g1vn = 10;
		String[] g1v = {"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		String[] g1e = {"e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8", "e9", "e10", "e11", "e12", "e13", "e14", "e15", "e16"};
		int[][] g1im = {
				{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
				{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
				{0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0},
				{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
		};
		boolean g1type = false;
		mygraph g1 = new mygraph(g1vn, g1v, g1e, g1im, g1type);
		System.out.print("DFS traversal: ");
		g1.myDFS();
		System.out.print("BFS traversal: ");
		g1.myBFS();
		System.out.println();
		
		//undirected unconnected
		System.out.println("--- test undirected unconnected graph ---");
		int g2vn = 10;
		String[] g2v = {"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		String[] g2e = {"e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8", "e9", "e10", "e11", "e12", "e13", "e14", "e15"};
		int[][] g2im = {
				{0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},//Q
				{1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0},//R
				{1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//S
				{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1},//T
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0},//U
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0},//V
				{0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1},//W
				{0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},//X
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0},//Y
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}//Z
		};
		boolean g2type = false;
		mygraph g2 = new mygraph(g2vn, g2v, g2e, g2im, g2type);
		System.out.print("DFS traversal: ");
		g2.myDFS();
		System.out.print("BFS traversal: ");
		g2.myBFS();
		System.out.println();
		
		//directed
		System.out.println("--- test directed graph ---");
		int g3vn = 10;
		String[] g3v = {"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		String[] g3e = {"e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8", "e9", "e10", "e11", "e12", "e13", "e14", "e15"};
		int[][] g3im = {
				{-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//Q
				{1, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//R
				{0, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1},//S
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0},//T
				{0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//U
				{0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 1, -1, 1},//V
				{0, 0, 0, 0, 1, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0},//W
				{0, 0, 0, -1, 0, 1, -1, -1, 0, 0, 0, 0, 0, 0, 0},//X
				{0, 0, 0, 0, 0, 0, 1, 0, 0, 1, -1, 0, -1, 0, 0},//Y
				{0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0}//Z
		};
		boolean g3type = true;
		mygraph g3 = new mygraph(g3vn, g3v, g3e, g3im, g3type);
		System.out.print("DFS traversal: ");
		g3.myDFS();
		System.out.print("BFS traversal: ");
		g3.myBFS();
		System.out.println();
	}

}
