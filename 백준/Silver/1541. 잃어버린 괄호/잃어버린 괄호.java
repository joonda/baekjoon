import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-+", true);

        int sum = 0;
        boolean isMinus = false;

        // 다음 token이 없을때 까지 반복
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            // token이 + 일때는 continue
            if (token.equals("+")) {
                continue;
                // token이 - 일때는 isMinus가 true가 되고, 그 이후에는 지속해서 -를 진행
                // 최소값을 만들기 위함
            } else if (token.equals("-")) {
                isMinus = true;
            } else {
                int num = Integer.parseInt(token);
                // isMinus가 true라면 지속적으로 이후 num을 뺀다
                if (isMinus) {
                    sum -= num;
                    // isMinus가 false라면 지속적으로 num을 더한다
                } else {
                    sum += num;
                }
            }
        }
        System.out.println(sum);
    }
}