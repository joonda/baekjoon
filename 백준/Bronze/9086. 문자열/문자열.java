import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        for (int i=0; i<t; i++) {
            StringBuilder sb = new StringBuilder();
            
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            sb.append(str.charAt(0));
            sb.append(str.charAt(str.length()-1));

            bw.write(sb + "\n");
            bw.flush();
        }
    }
}