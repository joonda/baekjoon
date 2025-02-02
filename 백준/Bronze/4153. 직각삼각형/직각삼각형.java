import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int[] arr = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            } else {
                int[] new_arr = Arrays.stream(arr).sorted().toArray();
                if (new_arr[0]*new_arr[0] + new_arr[1]*new_arr[1] == new_arr[2]*new_arr[2]) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
    }
}