import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] arr = new int[100][100];

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int x, y;

        for (int i=1; i<=T; i++) {
            st =  new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            for (int j=x; j<x+10; j++) {
                for (int k=y; k<y+10; k++) {
                    arr[j][k] = 1;
                }
            }
        }
        int width =0;
        for (int i=0; i<100; i++) {
            for (int j=0; j<100; j++) {
                if (arr[i][j] == 1) {
                    width += 1;
                }
            }
        }
        bw.write(width+"\n");
        bw.flush();
        bw.close();
    }
}