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
			graphs2.add(new Graph(n));
			Graph g = graphs2.get(num);
			num++;
			
			for (int i=0; i<n; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line, " ");
				int v1 = Integer.valueOf(st.nextToken());
				while (st.hasMoreTokens()) {
					int v2 = Integer.valueOf(st.nextToken());
					int w = Integer.valueOf(st.nextToken());
					g.graphEdge(v1-1,v2-1, w);
				}
			}		
		}
		br.close();
	}
}
