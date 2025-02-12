import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        List<Integer> listNum = new ArrayList<>();

        for (int i=0; i<N; i++) {
            listNum.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        Collections.sort(listNum);

        for (int num : listNum) {
            sb.append(num).append('\n');
        }

        System.out.println(sb);
    }
}
