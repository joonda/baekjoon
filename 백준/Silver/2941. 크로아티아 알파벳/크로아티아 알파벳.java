import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        String convert_str = str.replace("c=", "a")
                .replace("c-", "a")
                .replace("dz=", "a")
                .replace("d-", "a")
                .replace("lj", "a")
                .replace("nj", "a")
                .replace("s=", "a")
                .replace("z=", "a");

        bw.write(convert_str.length() + "\n");
        bw.flush();
    }
}