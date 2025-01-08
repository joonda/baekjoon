import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int throwBall = Integer.parseInt(st.nextToken());

        int[] basket = new int[size];

        for (int i=0; i<throwBall; i++){
            st = new StringTokenizer(br.readLine());
            int basketNum1 = Integer.parseInt(st.nextToken());
            int basketNum2 = Integer.parseInt(st.nextToken());
            int ballNum = Integer.parseInt(st.nextToken());

            for (int j = (basketNum1-1); j<basketNum2; j++) {
                basket[j] = ballNum;
            }
        }
        for (int i=0; i<basket.length; i++) {
            sb.append(basket[i] + " ");
        }
        bw.write(sb+"\n");
        bw.flush();
    }
}
