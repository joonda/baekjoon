import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];

        for (int i=0; i<8; i++) {
            int T = Integer.parseInt(st.nextToken());
            arr[i] = T;
        }

        String str = "";

        for (int j=1; j<8; j++) {
            if (arr[j] - arr[j-1] == 1) {
                str = "ascending";
            } else if (arr[j]- arr[j-1] == -1) {
                str = "descending";
            } else {
                str = "mixed";
                break;
            }
        }
        System.out.println(str);
    }
}