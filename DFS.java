package DM_project1;

public class DFS {
    int[][] graph;
    boolean[] visited;
    int n;

    public DFS(int[][] graph) {
        this.graph = graph;
        this.n = graph.length;
        this.visited = new boolean[n];
    }

    public void DFSOutput() {
        dfs(0);

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }

        System.out.println();
    }

    private void dfs(int v) {
        visited[v] = true;
        System.out.print((v + 1) + " ");

        for (int i = 0; i < n; i++) {
            if (graph[v][i] != 0 && !visited[i]) {
                dfs(i);
            }
        }
    }
}


