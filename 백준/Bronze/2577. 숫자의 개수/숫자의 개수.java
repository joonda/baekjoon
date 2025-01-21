import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        
        br.close();
        
        String result = String.valueOf(A*B*C);
        int[] arr = new int[10];

        for (int i=0; i<result.length(); i++) {
            char ch = result.charAt(i);
            arr[ch-'0']++;
        }
        for (int j=0; j<10; j++) {
            System.out.println(arr[j]);
        }
    }
}