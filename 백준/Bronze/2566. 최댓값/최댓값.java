import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int max = -1;
        int x = 0;
        int y = 0;

        for (int i = 1; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 10; j++) {
                int num = Integer.parseInt(st.nextToken());

                if (num > max) {
                    max = num;
                    x = i;
                    y = j;
               }
            }
        }
        bw.write(max+"\n");
        bw.write(x + " " + y + "\n");
        bw.flush();
    }
}