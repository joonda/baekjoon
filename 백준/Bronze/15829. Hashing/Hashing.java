import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int r = 31;

        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int sum = 0;
        for (int i=0; i<L; i++) {
            int ch = str.charAt(i)-'`';
            sum += (ch)*(Math.pow(r, i));
        }
        System.out.println(sum);
    }
}