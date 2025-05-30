import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =  Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());

            while (true) {
                if (isPrime(n)) {
                    System.out.println(n);
                    break;
                }
                n++;
            }
        }
    }

    public static boolean isPrime(long num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
