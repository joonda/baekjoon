import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        // 각 테스트 케이스 마다 확인
        for (int i = 0; i < T; i++) {
            // hashmap 선언, 각 테스트 케이스마다 독립적으로 연산.
            HashMap<String, Integer> cloth = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                // 이름은 필요없지만, 형식상으로 존재
                String clothName = st.nextToken();
                // 종류
                String clothType = st.nextToken();
                // 옷의 종류를 key값으로, 해당 옷 종류의 개수를 value 값으로 넣음
                cloth.put(clothType, cloth.getOrDefault(clothType, 0) + 1 );
            }
            int result = 1;
            // 옷 종류의 갯수 value 값을 count로 받는다.
            for (int count : cloth.values()) {
                // 각 종류별로 입거나, 안입거나 두 가지 선택지
                // 모자의 개수가 2개면 각 2개를 입거나, 아무것도 안입거나의 (즉, count + 1) 선택지가 존재
                result *= (count + 1);
            }
            // 하지만, 아예 아무 것도 안입는 경우의 수 1가지는 빼야하니 -1
            sb.append(result - 1).append("\n");
        }
        System.out.println(sb);
    }
}