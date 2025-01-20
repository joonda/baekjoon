import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken()); // 10진수
        int B = Integer.parseInt(st.nextToken()); // B진법

        while (N > 0) {
            if (N % B < 10) { // N을 진법으로 나눴을 때, 나머지가 10보다 작다면 (자연수)
                sb.append((char) ((N % B) + '0')); // ascii의 숫자 출력
            } else { // 나머지가 10보다 크다면
                sb.append((char) ((N % B) - 10 + 'A')); // ascii에 해당하는 문자 출력
            }
            N /= B; // 지속해서 N을 진법 B로 나눈다 (N이 0보다 클 때까지)
        }
        bw.write(sb.reverse() + "");
        bw.flush();
    }
}