import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int prizeOne = (int) (N - (N * 0.22));
        int prizeTwo = (int) (N - ((N - (N * 0.8)) * 0.22));

        System.out.print(prizeOne + " " + prizeTwo);
    }
}