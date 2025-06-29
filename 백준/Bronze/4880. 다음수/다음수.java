import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (true) {
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());

            if (a1 == 0 && a2 == 0 && a3 == 0) {
                break;
            }

            if ((a2 - a1) == (a3 - a2)) {
                int ap = a2 - a1;
                int result = a3 + ap;
                System.out.println("AP" + " " + result);
            } else {
                int gp = a2 / a1;
                int result = a3 * gp;
                System.out.println("GP" + " " + result);
            }
            st = new StringTokenizer(br.readLine());
        }
    }
}
