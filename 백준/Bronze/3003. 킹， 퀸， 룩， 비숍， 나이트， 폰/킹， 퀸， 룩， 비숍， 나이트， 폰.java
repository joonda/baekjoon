import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int[] array = {1, 1, 2, 2, 2, 8};
        
        for (int i=0; i<array.length; i++) {
            int cnt = Integer.parseInt(st.nextToken());

            String str = String.valueOf(array[i] - cnt);

            sb.append(str + " ");
        }
        bw.write(sb + "\n");
        bw.flush();
    }
}