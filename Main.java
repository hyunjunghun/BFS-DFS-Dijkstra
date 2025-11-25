package DM_project1;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphLoader gl = new GraphLoader();
		try {
			gl.graphLoad1();
			gl.graphLoad2();
		}
		catch (FileNotFoundException e) {
			System.out.println("돌아가");
		}
		catch (IOException e) {
			System.out.println("돌아가");
		}
		
//		//input1 그래프 출력
//		for (int j=0; j<gl.graphs1.size(); j++) {
//			Graph g = gl.graphs1.get(j);
//			System.out.println("graphs1:"+j);
//			for (int i = 0; i < g.graph.length; i++) {
//			    System.out.println(Arrays.toString(g.graph[i]));
//			}
//		}
//		
//		//input2 그래프 출력
//		for (int j=0; j<gl.graphs2.size(); j++) {
//			Graph g = gl.graphs2.get(j);
//			System.out.println("graphs2:"+j);
//			for (int i = 0; i < g.graph.length; i++) {
//			    System.out.println(Arrays.toString(g.graph[i]));
//			}
//		}
		
		//DFS, BFS
		System.out.println("1. 그래프 탐방 수행 결과");
		
		
		//Dijkstra
		System.out.println("2. 최단 경로 구하기 수행 결과");
		
		
	}

}
