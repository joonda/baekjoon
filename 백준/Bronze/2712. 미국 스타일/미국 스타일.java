import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            double x = Double.parseDouble(st.nextToken());
            String s = st.nextToken();

            if (s.equals("kg")) {
                System.out.printf("%.4f lb\n", x * 2.2046);
            } else if (s.equals("l")) {
                System.out.printf("%.4f g\n", x * 0.2642);
            } else if (s.equals("lb")) {
                System.out.printf("%.4f kg\n", x * 0.4536);
            } else if (s.equals("g")) {
                System.out.printf("%.4f l\n", x * 3.7854);
            }
        }
    }
}