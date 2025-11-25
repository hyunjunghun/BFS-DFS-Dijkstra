package DM_project1;

public class Graph {
	int n;
	int[][] graph;
	
	public Graph(int n) {
		if (n>100) System.out.println("조건 위배");
		this.n = n;
		this.graph = new int[n][n];
	}
	
	public void graphEdge(int v1, int v2) {
		graph[v1][v2] = 1;
	}
	
	public void graphEdge(int v1, int v2, int w) {
		if (w<1) System.out.println("조건 위배");
		graph[v1][v2] = w;
	}
}
