import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> mapA = new HashMap<>();
        HashMap<Integer, Integer> mapB = new HashMap<>();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            mapA.put(a, mapA.getOrDefault(a, 0) + 1);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int b = Integer.parseInt(st.nextToken());
            mapB.put(b, mapB.getOrDefault(b, 0) + 1);
        }
        
        int count = 0;
        
        for (int key : mapA.keySet()) {
            if (!mapB.containsKey(key)) {
                count++;
            }
        }

        for (int key : mapB.keySet()) {
            if (!mapA.containsKey(key)) {
                count++;
            }
        }

        System.out.println(count);
    }
}