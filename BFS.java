package DM_project1;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	int[][] graph;
	int n;
    boolean[] visited;


	public BFS(int[][] graph) {
        this.graph = graph;
        this.n = graph.length;
        this.visited = new boolean[n];
	}
	
	public void BFSOutput() {
        this.visited = new boolean[n]; // 그래프 2개 이상일떄 초기화
        bfs(1);
        System.out.println("");

	}

    private void bfs(int s) {
        //정점 s로 시작
        s = s-1;
        int index = 0;
        Queue<Integer> array = new LinkedList<>();
        visited[s] = true;
        array.offer(s); //{0}
        boolean First = true;

        while (!array.isEmpty()) {
            int peak = array.poll();

            if(First) {
                System.out.print(peak+1);
                First = false;
            } else
                System.out.print(" - " + (peak+1)); 


            for(int i = 0 ; i < n ; i++) {
                if (graph[peak][i] == 1 && visited[i] != true) {
                    array.add(i);
                    visited[i] = true;
                }
            }
        }


    }
}

