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
        this.visited = new boolean[n]; // 그래프 2개 이상일떄 초기화해줘야됨
        bfs(1);
        System.out.println(""); //줄바꿈은 여기서

	}

    private void bfs(int s) {
        //정점 s로 시작
        s = s-1;
        int index = 0;
        Queue<Integer> array = new LinkedList<>();
        visited[s] = true; //방문한거 받아줌
        array.offer(s); //{0}
        boolean First = true;

        while (!array.isEmpty()) {
            int peak = array.poll(); //0 //1

            if(First) {
                System.out.print(peak+1);
                First = false;
            } else
                System.out.print(" - " + (peak+1)); //처음에는 그냥 숫자만 출력 그 뒤는 전부 하이픈까지 같이 출력


            for(int i = 0 ; i < n ; i++) {
                if (graph[peak][i] == 1 && visited[i] != true) {
                    array.add(i); //{1,2}
                    visited[i] = true; //{true , true , true}
                }
            }
        }


    }
}
