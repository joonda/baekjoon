import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        if (t % 5 == 0) {
            System.out.println(t / 5);
        } else {
            System.out.println((t / 5) + 1);
        }
    }
}