import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 몸무게
            arr[i][1] = Integer.parseInt(st.nextToken()); // 키
        }

        for (int i=0; i<N; i++) {
            int rank = 1; // rank는 1부터 시작한다.

            for (int j=0; j<N; j++) {
                if (i==j) continue; // 자기 자신과의 비교는 필요없는 연산, 제외

                // i번째 사람과 j번째 사람의 키와 몸무게를 비교하여 i가 j보다 덩치가 작을 경우
                // rank 값을 +1
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            
            // i의 rank 값 출력
            System.out.print(rank + " ");
        }
    }
}
