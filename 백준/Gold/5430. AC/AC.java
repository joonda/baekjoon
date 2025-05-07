import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 테스트 케이스 수
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			// 수행할 함수 p
			String p = br.readLine();

			// 배열 안의 숫자의 개수 n
			int n = Integer.parseInt(br.readLine());

			// deque 선언 (reverse, front 양쪽으로 자유롭게 넣고 뺄 수 있다)
			Deque<Integer> deque = new LinkedList<>();
			
			// 배열 String 가져오기
			String arrStr = br.readLine();
			// n이 0이 아닐때 정의
			if (n != 0) {
				// 맨 앞, 뒤 대괄호 빼기
				arrStr = arrStr.substring(1, arrStr.length() - 1);
				// 쉼표를 기준으로 분리
				String[] strArr = arrStr.split(",");

				// deque에 분리된 원소를 넣는다
				for (int j = 0; j < strArr.length; j++) {
					deque.add(Integer.parseInt(strArr[j]));
				}
			}

			// flag 선언
			boolean isReversed = false;
			boolean isError = false;

			// function
			for (int f = 0; f < p.length(); f++) {
				// function 한개씩 추출
				char func = p.charAt(f);

				// 만약 function이 R이라면
				if (func == 'R') {
					// isReversed flag를 반대로 지정
					isReversed = !isReversed;

					// 만약 D라면
				} else if (func == 'D') {
					// deque가 비어있지 않고
					if (!deque.isEmpty()) {
						// reverse 상태라면
						if (isReversed) {
							// 뒤의 원소를 뻬고
							deque.pollLast();
							// 아니라면 앞의 원소를 뺀다
						} else {
							deque.pollFirst();
						}
						// deque가 비어있다면
					} else {
						// isError를 반환한다.
						isError = true;
						break;
					}
				}
			}
			if (isError) {
				// isError가 true라면 error 출력
				System.out.println("error");
			} else {
				StringBuilder sb = new StringBuilder();
				sb.append("[");

				// deque가 비어있지 않을때까지 반복
				while (!deque.isEmpty()) {
					// isReversed라면 deque에서 마지막 원소를 빼고, isReverse가 아니라면 첫번째 원소를 뺀다.
					// 이를 StringBuilder에 넣는다
					sb.append(isReversed ? deque.pollLast() : deque.pollFirst());
					// 또한 deque가 비어있지 않다면, 사이사이에 쉼표를 넣는다.
					if (!deque.isEmpty()) {
						sb.append(",");
					}
				}
				sb.append("]");
				System.out.println(sb.toString());
			}
		}
	}
}