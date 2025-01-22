import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st.nextToken());

            int quarter = C / 25; // quarter 25 cent
            C%=25; // quarter 나머지

            int dime = C / 10; // dime 10 cent
            C%=10; // dime 나머지

            int nickel = C / 5; // nickel 5 cent
            C%=5; // nickel 나머지

            int penny = C; // penny는 1 cent 이기 때문에 나머지를 구할 필요 X

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny + " ");
        }
        br.close();
    }
}