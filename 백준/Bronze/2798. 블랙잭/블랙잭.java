import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] cardArr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<cardArr.length; i++)  {
            cardArr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        for (int i=0; i<cardArr.length-2; i++) {
            for (int j=i+1; j<cardArr.length-1; j++) {
                for (int k=j+1; k<cardArr.length; k++) {
                    int sum = cardArr[i] + cardArr[j] + cardArr[k];

                    if (sum == M) {
                        System.out.println(sum);
                        return;
                    }
                    else if (sum < M) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        System.out.println(max);
    }
}