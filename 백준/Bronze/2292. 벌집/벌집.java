import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        br.close();

        int count = 1; // 몇 번째 단계인지 (계층)
        int range = 2; // 각 계층에서 포함된 방 번호의 범위, 2단계의 시작 2로 초기화

        if (T == 1) { // T가 1일때는 1단계이기 때문에 그대로 출력
            System.out.println(count);
        }

        else { // T가 2 이상인 경우, 계층을 찾는다
            while (range <= T) {
                // 현재 range에 해당 단계의 방 개수를 더함, 다음 단계의 시작 번호로 갱신
                // T가 13이 들어온다면?
                // range는 초기값 2부터 시작, 8, 20 순으로 증가
                range = range + (6 * count);

                // 계층 수를 계속 더한다.
                count++;
            }
            System.out.println(count);
        }
    }
}