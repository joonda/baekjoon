import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 해시맵 선언
        HashMap<Integer, Integer> map = new HashMap<>();

        // 상근이가 가지고 있는 숫자카드의 개수
        int n = Integer.parseInt(br.readLine());

        // 상근이가 가지고 있는 숫자카드
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 해시맵 안에 상근이가 가지고 있는 숫자 카드 값을 키 값으로 넣고, value를 1로 넣는다.
        for (int i = 0; i < n; i++) {
            map.put(Integer.parseInt(st.nextToken()), 1);
        }

        // 체크해야하는 숫자 카드의 개수
        int m = Integer.parseInt(br.readLine());

        // 체크해야하는 숫자 카드
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            // 체크해야하는 숫자 카드 값이 null이 아니라면 1, null이라면 0을 append
            if (map.get(Integer.parseInt(st2.nextToken())) != null) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb.toString());
    }
}