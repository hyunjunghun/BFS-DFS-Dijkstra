package DM_project1;

public class Graph {
	int n;
	int[][] graph;
	
	public Graph(int n) {
		this.n = n;
		this.graph = new int[n][n];
	}
	
	public void graphEdge(int v1, int v2) {
		graph[v1][v2] = 1;
	}
	
	public void graphEdge(int v1, int v2, int w) {
		graph[v1][v2] = w;
	}
}
