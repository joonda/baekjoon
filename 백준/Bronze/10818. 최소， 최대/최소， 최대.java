import com.sun.jdi.IntegerValue;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 첫 번째 줄에서 N을 입력받기
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int min = Integer.parseInt(st.nextToken());
        int max = min;

        for(int i = 0 ; i<N-1; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (min > value) {
                min = value;
            }

            if (max < value) {
                max = value;
            }
        }

        bw.write(min + " "+ max + "\n");
        bw.flush();
        bw.close();
    }
}
