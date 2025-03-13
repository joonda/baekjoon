import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        boolean[] S = new boolean[21];

        while (M -- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int x = 0;

            if (!command.equals("all") && !command.equals("empty")) {
                x = Integer.parseInt(st.nextToken());
            }
            switch (command) {
                case "add":
                    S[x] = true;
                    break;
                case "remove":
                    S[x] = false;
                    break;
                case "check":
                    if (S[x]) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                case "toggle":
                    if (S[x]) { S[x] = false; } else { S[x] = true; }
                    break;
                case "all":
                    Arrays.fill(S, true);
                    break;
                case "empty":
                    Arrays.fill(S, false);
                    break;
            }
        }

        System.out.println(sb);
    }
}