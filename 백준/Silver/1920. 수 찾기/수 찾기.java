import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 숫자의 개수 N
        int N = Integer.parseInt(br.readLine());
        
        // Line의 정수들을 StringTokenizer()로 받는다.
        st = new StringTokenizer(br.readLine());
        
        // 해시맵 선언
        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i=0; i<N; i++) {
            // Line의 정수 하나씩 a에 대입
            int a = Integer.parseInt(st.nextToken());
            
            // 만약 Map의 key에 정수 a가 있다면
            if (integerMap.containsKey(a)) {
                // 해당 Map의 key의 value에 1을 더한다
                integerMap.put(a, integerMap.get(a) + 1);
            } else {
                // 만약 key에 정수 a가 없다면, 정수 a를 key에 추가하고, 1을 지정한다.
                integerMap.put(a, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();

        for (int i=0; i<M; i++) {
            // 찾으려는 정수를 a에 대입
            int a = Integer.parseInt(st.nextToken());
            
            // 만약 정수가 있는 Map에 a라는 key 값이 있다면
            if (integerMap.containsKey(a)) {
                // 1을 출력한다
                sb.append(1).append("\n");
            } else {
                // 없다면 0을 출력한다
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}