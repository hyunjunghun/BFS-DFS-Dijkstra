package DM_project1;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphLoader gl = new GraphLoader();
		try {
			gl.graphLoad1();
			gl.graphLoad2();
		}
		catch (FileNotFoundException e) {
			System.out.println("오류: 파일을 찾을 수 없습니다. (" + e.getMessage() + ")");		
		}
		catch (IOException e) {
			System.out.println("오류: 파일 입출력 중 문제가 발생했습니다. (" + e.getMessage() + ")");		
		}
		
		
		//DFS, BFS
		System.out.println("1. 그래프 탐방 수행 결과");
		for (int j=0; j<gl.graphs1.size(); j++) {
			Graph g = gl.graphs1.get(j);
			DFS d = new DFS(g.graph);
			BFS b = new BFS(g.graph);
			System.out.println("그래프 ["+(j+1)+"]");
			System.out.println("----------------------------");
			System.out.println("깊이 우선 탐색");
			d.DFSOutput();
			System.out.println("너비 우선 탐색");
			b.BFSOutput();
			System.out.println("============================");			
		}
		
		//Dijkstra
		System.out.println("2. 최단 경로 구하기 수행 결과");
		for (int j=0; j<gl.graphs2.size(); j++) {
			Graph g = gl.graphs2.get(j);
			Dijkstra d = new Dijkstra(g.graph);
			System.out.println("그래프 ["+(j+1)+"]");
			System.out.println("----------------------------");
			System.out.println("시작점 : 1");
			d.DijkstraOutput();
			System.out.println("============================");			
		}
		
		
	}

}



