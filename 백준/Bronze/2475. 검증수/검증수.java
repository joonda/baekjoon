import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int sum = 0;

        while (st.hasMoreTokens()) {
            int i = Integer.parseInt(st.nextToken());
            sum += i*i;
        }
        bw.write((sum % 10) + "\n");
        bw.flush();
    }
}