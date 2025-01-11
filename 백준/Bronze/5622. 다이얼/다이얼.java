import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        int t = 0;

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            switch (ch) {
                case 'A', 'B', 'C' -> t+=3;
                case 'D', 'E', 'F' -> t+=4;
                case 'G', 'H', 'I' -> t+=5;
                case 'J', 'K', 'L' -> t+=6;
                case 'M', 'N', 'O' -> t+=7;
                case 'P', 'Q', 'R', 'S' -> t+=8;
                case 'T', 'U', 'V' -> t+=9;
                case 'W', 'X', 'Y', 'Z' -> t+=10;
            }
        }
        bw.write(t + "\n");
        bw.flush();
    }
}
