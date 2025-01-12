import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        for (int i=str.length()-1; i>=0; i--) {
            sb.append(str.charAt(i));
        }

        if (str.contentEquals(sb)) {
            bw.write(1 + "\n");
        } else {
            bw.write(0 + "\n");
        }
        bw.flush();
    }
}
