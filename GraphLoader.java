package DM_project1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class GraphLoader {
	//그래프 list
	ArrayList<Graph> graphs1 = new ArrayList<>();
	ArrayList<Graph> graphs2 = new ArrayList<>();
	
	//input1
	public void graphLoad1() throws FileNotFoundException, IOException{
		BufferedReader br = new BufferedReader(new FileReader("input1.txt"));
		String line;
		int num = 0;
		
		while ((line=br.readLine()) != null) {
			int n = Integer.valueOf(line);
			
			if (n>100) {
				System.out.println("err:그래프당 정점 최대 개수는 100");
				System.exit(1);
			}
			
			graphs1.add(new Graph(n));
			Graph g = graphs1.get(num);
			num++;
			
			for (int i=0; i<n; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line, " ");
				int v1 = Integer.valueOf(st.nextToken());
				while (st.hasMoreTokens()) {
					int v2 = Integer.valueOf(st.nextToken());
					g.graphEdge(v1-1,v2-1);
				}
			}		
		}
		
		br.close();
	}
	
	//input2
	public void graphLoad2() throws FileNotFoundException, IOException{
		BufferedReader br = new BufferedReader(new FileReader("input2.txt"));
		String line;
		int num = 0;
		
		while ((line=br.readLine()) != null) {
			int n = Integer.valueOf(line);
			
			if (n>100) {
				System.out.println("err:그래프당 정점 최대 개수는 100");
				System.exit(1);
			}
			
			graphs2.add(new Graph(n));
			Graph g = graphs2.get(num);
			num++;
			
			for (int i=0; i<n; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line, " ");
				int v1 = Integer.valueOf(st.nextToken());
				while (st.hasMoreTokens()) {
					int v2 = Integer.valueOf(st.nextToken());
					
					int w = -1;
					try { 
						w = Integer.valueOf(st.nextToken()); 
					}
					catch (NumberFormatException e) {
						System.out.println("err:정점간 거리는 0보다 큰 정수 값");
						System.exit(1);
					}
					
					if (w<1) {
						System.out.println("err:정점간 거리는 0보다 큰 정수 값");
						System.exit(1);
					}
					
					g.graphEdge(v1-1,v2-1, w);
				}
			}		
		}
		br.close();
	}
}
