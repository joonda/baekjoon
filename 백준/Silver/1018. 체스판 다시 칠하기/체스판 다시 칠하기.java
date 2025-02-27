import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minChange = Integer.MAX_VALUE;
        for (int i = 0; i <= N-8; i++) {
            for (int j=0; j <= M-8; j++) {
                int changesBW = 0;
                int changesWB = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        char expectedBW = ((k+l) % 2 == 0) ? 'B' : 'W';
                        char expectedWB = ((k+l) % 2 == 0) ? 'W' : 'B';

                        if (board[i+k][j+l] != expectedBW) {
                            changesBW++;
                        }
                        if (board[i+k][j+l] != expectedWB) {
                            changesWB++;
                        }
                    }
                }
                minChange = Math.min(minChange, Math.min(changesBW, changesWB));
            }
        }
        System.out.println(minChange);
    }
}