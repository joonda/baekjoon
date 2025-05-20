import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int[] arr = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            int a = input.charAt(i) - '0';

            arr[i] = a;
        }

        Arrays.sort(arr);

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}