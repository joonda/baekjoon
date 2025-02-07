import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int maxNum = getGCD(num1, num2);

        System.out.println(maxNum);
        System.out.println((num1*num2) / maxNum);

    }
    public static int getGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return getGCD(num2, num1 % num2);
    }
}