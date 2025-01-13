import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        int[] arr = new int[26];

        for (int i=str.length()-1; i>=0; i--) {
            char c = str.charAt(i);
            c = Character.toUpperCase(c);
            arr[c-65]++;
        }

        int max = -1;
        char ch = '?';

        for (int j=0; j<arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                ch = (char) (j+65);
            }
            else if (arr[j] == max) {
                ch = '?';
            }
        }

        bw.write(ch + "\n");
        bw.flush();
    }
}