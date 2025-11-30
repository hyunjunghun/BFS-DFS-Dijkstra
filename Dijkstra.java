package DM_project1;

public class Dijkstra {

    private int[][] graph;
    private int size;

    public Dijkstra(int[][] graph) {
        this.graph = graph;
        this.size = graph.length;
    }

    public void DijkstraOutput() {

        int start = 0;
        int[] dist = new int[size];
        int[] parent = new int[size];
        boolean[] visited = new boolean[size];

        for (int i = 0; i < size; i++) {
            dist[i] = Integer.MAX_VALUE;
            parent[i] = -1;
            visited[i] = false;
        }
        dist[start] = 0;

        for (int i = 0; i < size; i++) {

            int u = -1;
            int min = Integer.MAX_VALUE;

            for (int v = 0; v < size; v++) {
                if (!visited[v] && dist[v] < min) {
                    min = dist[v];
                    u = v;
                }
            }

            visited[u] = true;

            for (int v = 0; v < size; v++) {
                if (graph[u][v] > 0 && !visited[v]) {
                    int newDist = dist[u] + graph[u][v];
                    if (newDist < dist[v]) {
                        dist[v] = newDist;
                        parent[v] = u;
                    }
                }
            }
        }

        System.out.println("시작점 : 1");

        for (int i = 1; i < size; i++) {
            System.out.print("정점 [" + (i + 1) + "]: ");

            int[] stack = new int[size];
            int top = 0;
            int cur = i;
            while (cur != -1) {
                stack[top++] = cur;
                cur = parent[cur];
            }

            for (int k = top - 1; k >= 0; k--) {
                System.out.print(stack[k] + 1);
                if (k > 0) System.out.print(" – ");
            }

            System.out.println(", 길이: " + dist[i]);
        }
    }
}
