import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String strA = st.nextToken();
        int A = Integer.parseInt(strA);

        st = new StringTokenizer(br.readLine());
        String strB = st.nextToken();
        int B = Integer.parseInt(strB);

        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());

        String result = strA+strB;
        int casting_result = Integer.parseInt(result);

        bw.write(((A+B)-C) + "\n");
        bw.write((casting_result-C) + "\n");
        bw.flush();
    }
}