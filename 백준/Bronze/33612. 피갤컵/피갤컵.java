import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int totalMonths = 8 + (N - 1) * 7;
        int year = 2024 + (totalMonths - 1) / 12;
        int month = ((totalMonths - 1) % 12) + 1;

        System.out.println(year + " " + month);
    }
}