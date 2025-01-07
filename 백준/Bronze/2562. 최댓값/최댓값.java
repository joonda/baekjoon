import com.sun.jdi.IntegerValue;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int max = 0;
        int idx = 0;

        for(int i=1; i<=9; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            if (max < N) {
                max = N;
                idx = i;
            }
        }

        bw.write(max + "\n");
        bw.write(idx + "\n");
        bw.flush();
        bw.close();
    }
}
