import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean flag = true;
        while (flag) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            if (N == -1) {
                flag = false;
            }

            else {
                List<Integer> arr = new ArrayList<>();
                int sum = 0;
                for (int i=1; i<N; i++) {
                    if (N % i == 0) {
                        sum += i;
                        arr.add(i);
                    }
                }

                if (N == sum) {
                    System.out.print(N + " = ");
                    for (int j=0; j<arr.size(); j++) {
                        if (j == arr.size()-1) {
                            System.out.println(arr.get(j));
                        } else {
                            System.out.print(arr.get(j) + " + ");
                        }
                    }
                } else {
                    System.out.println(N + " is NOT perfect.");
                }
            }
        }
    }
}