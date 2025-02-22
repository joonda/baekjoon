import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // HashMap 선언
        Map<Integer, Integer> map = new HashMap<>();

        // 가지고 있는 숫자 카드의 개수 N과 카드 안에 있는 숫자가 적힌 줄을 저장
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 가지고 있는 숫자가 몇개있는지를 확인해야하는 N과 해당 숫자를 저장
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        br.close();
        
        for (int i = 0; i < N; i++) {
            // 하나씩 정수를 가져온다
            int a = Integer.parseInt(st.nextToken());
            // map에 a라는 숫자의 key 값이 있다면
            if (map.containsKey(a)) {
                // 해당 key 값에 value 값을 +1
                map.put(a, map.get(a) + 1);
            } else {
                // 만약 아니라면 a라는 숫자의 key 값과 value = 1로 초기화
                map.put(a, 1);
            }
        }

        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(st2.nextToken());
            // 만약에 key값 a가 hashmap에 존재한다면
            if (map.containsKey(a)) {
                // 해당 key 값의 value 값 (해당 숫자가 들어간 카드의 개수) 출력
                sb.append(map.get(a)).append(" ");
            } else {
                // 해당 숫자가 들어간 카드가 없다면 0을 출력
                sb.append(0).append(" ");
            }
        }
        // StringBuilder 출력
        System.out.println(sb);
    }
}