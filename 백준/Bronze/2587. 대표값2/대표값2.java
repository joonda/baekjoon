import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {

            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(getAvg(arr));
        System.out.println(getMedian(arr));
    }

    public static int getAvg(int[] arr) {

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }

        return sum / 5;
    }

    public static int getMedian(int[] arr) {

        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
}