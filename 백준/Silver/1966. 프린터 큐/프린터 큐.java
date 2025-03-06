import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		// 테스트 케이스 개수 입력
		int T = Integer.parseInt(br.readLine());
		
		for (int i=0; i<T; i++) {

			st = new StringTokenizer(br.readLine());
			// 문서의 개수
			int N = Integer.parseInt(st.nextToken());
			// 관심있는 문서의 위치 index
			int M = Integer.parseInt(st.nextToken());
			
			Queue<int[]> queue = new LinkedList<int[]>();
			
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<N; j++) {
				
				int priority = Integer.parseInt(st.nextToken());
				// 문서의 위치 index, 우선순위 queue 배열에 넣는다.
				queue.add(new int[] {j, priority});
			}
			
			// e.g (0,1), (1,1), (2,9), (3,1), (4,1), (5,1)
			int printCount = 0;
			while(!queue.isEmpty()) {
				// 큐의 맨 앞을 꺼냄
				// e.g. (0,1)
				int[] front = queue.poll();
				
				// e.g. 0
				int index = front[0];
				// e.g. 1
				int priority = front[1];
				
				// flag
				boolean hasHigherPriority = false;
				
				// 맨 앞의 문서가 남아있는 문서들 중, 가장 우선순위를 가지고 있는지 여부를 확인
				for (int[] doc : queue) {
					// e.g. 1, 9, ... 와 1을 비교한다
					if (doc[1] > priority) {
						hasHigherPriority = true;
						break;
					}
				}
				// 만약 더 높은 우선순위를 가지고 있다면 큐의 뒤쪽으로 보낸다
				// (2, 9)가 큐의 맨 뒤로 간다
				if (hasHigherPriority) {
					queue.add(front);
				} else {
					// 아니라면, 출력 횟수를 증가
					printCount++;
					
					// 만약 e.g. index = 0과 앞서 M이 같다면 출력 후 break;
					if (index == M) {
						System.out.println(printCount);
						break;
					}
				}
				
			}
		}
	}
}
