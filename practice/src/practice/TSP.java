package practice;
import java.util.*;

public class TSP {
	// 도시의 수
	private static int n;
	// 두 도시간의 거리를 저장하는배열
	private static int dist[][];
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		dist = new int[n][n];
		// 거리를 랜덤으로 나타낸다.
		for(int i=0;i<dist.length;i++) {
			for(int j=0;j<dist[i].length;j++) {
				dist[i][j] = new Random().nextInt() + 1;
			}
		}
		
		//경로를 저장할 List 선언
		List<Integer> path = new ArrayList<Integer>();
		//이미 들린 도시인지 확인하기 위한 배열 선언
		boolean[] visited = new boolean[n];
		//첫번째 도시를 시작점으로
		visited[0] = true;
		path.add(0);
		
		System.out.println(Arrays.deepToString(dist));
		
		

	}
	
	private static int shortestPath(List<Integer> path, boolean[] visited, int currentLength) {
		int len = path.size();
		
		if(len == n) {
			return currentLength + dist[path.get(0)][path.get(len-1)];
		}
		// 임의의 매우 큰값으로 초기화
		int ret = Integer.MAX_VALUE;
		// 다음 방문할 도시를 전부 시도한다.
		for(int next=0;next<n;next++) {
			if(visited[next]) {
				continue;
			}
			//path가 결정된 크기를 할당
			int here = path.size() -1;
			// 경로에 index 할당
			path.add(next);
			// 방문했음을 표시
			visited[next] = true;
			//나머지 경로를 재귀 호출을 통해 완성하고 가장 짧은 경로의 길이를 얻는다.
			int cand = shortestPath(path, visited,currentLength + dist[here][next]);
			// 경로의 짧은 것을 선택
			ret =Math.min(ret, cand);
			visited[next] = false;
			
			path.remove(here);
		}
		return ret;
	}

}
