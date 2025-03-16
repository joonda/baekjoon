import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 동전을 담을 List 지정
        List<Integer> won = new ArrayList<>();

        // 동전(coin)이 지정된 k원보다 크다면, 필요가 없기 때문에, k원보다 작거나 같은것만 List에 담는다.
        for (int i = 0; i < n; i++) {
            int coin = Integer.parseInt(br.readLine());
            if (coin > k) {
                break;
            } else {
                won.add(coin);
            }
        }
        // 동전을 담은 List를 내림차순으로 정렬
        won.sort(Collections.reverseOrder());

        // List의 idx와 필요한 동전 개수 count의 초기값 지정
        int idx = 0;
        int count = 0;

        // k원이 0원이 될때까지
        while (k > 0) {
            // 만약 동전을 담은 리스트에서 제일 큰 동전이 (idx=0) k원보다 작다면
            if (k >= won.get(idx)) {
                // 지속적으로 해당 동전을 뺀다
                k -= won.get(idx);
                // 그리고 count를 +1
                count++;
                // 하지만, k원보다 작다면 그 다음 idx로 넘어감
            } else {
                // idx를 +1
                idx++;
            }
        }
        System.out.println(count);
    }
}
