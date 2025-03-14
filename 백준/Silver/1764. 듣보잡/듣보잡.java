import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            set.add(br.readLine());
        }

        for (int j=1; j<=m; j++) {
            String name = br.readLine();
            if (set.contains(name)) {
                result.add(name);
            }
        }

        Collections.sort(result);

        sb.append(result.size()).append("\n");

        for (String name : result) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}