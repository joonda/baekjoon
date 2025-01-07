import com.sun.jdi.IntegerValue;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 첫 번째 줄에서 N을 입력받기
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[] int_array = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<int_array.length; i++) {
            int value = Integer.parseInt(st.nextToken());
            int_array[i] = value;
        }

        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for (int i=0; i<int_array.length; i++) {
            if(int_array[i] == v) {
                cnt += 1;
            }
        }
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
}
