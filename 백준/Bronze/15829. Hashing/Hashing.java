import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        long sum = 0;
        long pow = 1;
        for (int i=0; i<L; i++) {
            int ch = str.charAt(i)- 96;
            // sum에는 문자열을 숫자로 변환한 값에 pow를 곱하고, 이를 M으로 나눈 나머지를 더한다
            // overflow 방지위해 M을 나눈 나머지를 표현.
            sum = (sum + ch * pow) % 1234567891;
            // pow는 r을 지속적으로 곱한 값에 M을 나눈 나머지 표현
            pow = (pow * 31) % 1234567891;
        }
        System.out.println(sum);
    }
}