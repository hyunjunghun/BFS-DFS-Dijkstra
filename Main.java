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
			System.out.println("돌아가");
		}
		catch (IOException e) {
			System.out.println("돌아가");
		}
		
		
		//DFS, BFS
		System.out.println("1. 그래프 탐방 수행 결과");
		
		
		//Dijkstra
		System.out.println("2. 최단 경로 구하기 수행 결과");
		
		
	}

}

