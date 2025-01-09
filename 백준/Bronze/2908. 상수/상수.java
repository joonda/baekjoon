import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken();
        String str2 = st.nextToken();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<3; i++) {
            sb.append(str1.charAt(2-i));
        }

        StringBuilder sb2 = new StringBuilder();

        for (int i=0; i<3; i++) {
            sb2.append(str2.charAt(2-i));
        }

        int num1 = Integer.parseInt(sb.toString());
        int num2 = Integer.parseInt(sb2.toString());

        if (num1 > num2) {
            bw.write(String.valueOf(num1));
            bw.flush();

        } else {
            bw.write(String.valueOf(num2));
            bw.flush();
        }
        }
}