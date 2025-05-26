import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());


        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 최소 공배수 구하기
            System.out.println(a * b / getGCD(a, b));
        }
    }

    // 최대 공약수
    public static int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return getGCD(b, a % b);
    }
}