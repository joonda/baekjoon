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

        HashMap<String, String> hashMap = new HashMap<>();

        for (int i=0; i<n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            String site = stringTokenizer.nextToken();
            String password = stringTokenizer.nextToken();

            hashMap.put(site, password);
        }

        for (int j=0; j<m; j++) {
            String site = br.readLine();

            if (hashMap.containsKey(site)) {
                sb.append(hashMap.get(site)).append("\n");
            }
        }

        System.out.println(sb);
    }
}