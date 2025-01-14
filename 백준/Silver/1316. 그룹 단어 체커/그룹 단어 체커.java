import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int count = 0;

        for (int i=0; i<N; i++) {
            if (check(br)) {
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
    }

    public static boolean check(BufferedReader br) throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {
                if (!check[now - 97]) {
                    check[now - 97] = true;
                    prev = now;
                }

                else {
                    return false;
                }
            }
        }
        return true;
    }
}
