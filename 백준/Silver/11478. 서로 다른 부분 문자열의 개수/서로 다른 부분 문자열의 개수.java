import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        // 해시맵 선언
        HashMap<String, Integer> map = new HashMap<>();
        
        // 이중 for문으로 진행
        for (int i = 0; i < line.length(); i++) {
            for (int j = i+1; j <= line.length(); j++) {
                // substring으로 i 부터 j 까지 문자열을 저장한다
                map.put(line.substring(i, j), map.getOrDefault(line.substring(i, j), 0) + 1);
            }
        }

        // ketSet으로 서로 다른 부분 문자열 개수를 중복없이 출력한다.
        System.out.println(map.keySet().size());
    }
}