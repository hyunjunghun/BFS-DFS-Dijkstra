package DM_project1;

import java.util.ArrayList;

public class DFS {
    int[][] graph;
    boolean[] visited;
    int n;
    ArrayList<Integer> order = new ArrayList<>();

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

        printOrder();   // <-- only the result line
    }

    private void dfs(int v) {
        visited[v] = true;
        order.add(v + 1);

        for (int i = 0; i < n; i++) {
            if (graph[v][i] != 0 && !visited[i]) {
                dfs(i);
            }
        }
    }

    private void printOrder() {
        for (int i = 0; i < order.size(); i++) {
            System.out.print(order.get(i));
            if (i != order.size() - 1) {
                System.out.print(" – ");
            }
        }
        System.out.println();
    }
}
