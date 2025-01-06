import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb;
        for (int i=1; i<=N; i++) {
            sb = new StringBuilder();
            for (int j=0; j<N-i; j++){
                sb.append(" ");
            }
            for (int j=0; j<i; j++){
                sb.append("*");
            }
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
