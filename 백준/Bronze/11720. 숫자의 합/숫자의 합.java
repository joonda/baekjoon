import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        int sum = 0;

        for (int i=0; i<str.length(); i++) {
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += num;
        }
        bw.write(sum + "\n");
        bw.flush();
        }
    }