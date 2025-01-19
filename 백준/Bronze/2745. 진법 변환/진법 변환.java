import java.io.*;
import java.util.StringTokenizer;

// 2745번 진법변환
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;

        st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int sum = 0;
        int tmp = 1;

        for (int i=N.length()-1; i>=0; i--) {
            char C = N.charAt(i); // 들어온 문자 or 숫자를 하나씩 char 변수 C에 대입

            if ('A' <= C && C <= 'Z') { // 만약 들어온 것이 문자라면
                sum += (C-'A' + 10) * tmp; // 문자에서 'A'를 뺀 후, +10 (문제에서 A=10 ~ Z=35이기 때문.)
                                            // 이후 tmp를 곱한다. (뒤에서 부터 제곱수를 해야하기 때문에)
                                            // 이후 sum에 지속해서 더함
            } else {
                sum += (C-'0') * tmp; // 만약 들어온 것이 숫자라면 '0'을 뺀후, 숫자로 변환
                                        // 이후 tmp를 곱한다
                                        // 이후 sum에 지속해서 더함
            }
            tmp *= B; // 처음은 맨뒤부터 제곱을 진행 -> a^0은 1
                        // 이후 B를 곱한다 (제곱수)
        }
        bw.write(sum + "\n");
        bw.flush();
    }
}