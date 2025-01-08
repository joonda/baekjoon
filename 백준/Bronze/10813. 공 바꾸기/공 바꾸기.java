import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int changeBall = Integer.parseInt(st.nextToken());
        
        // 1부터 size번 까지 바구니를 생성
        int[] basket = IntStream.rangeClosed(1, size).toArray();

        // 볼 바꾸기 시행 횟수 for문 반복
        for (int i=0; i<changeBall; i++){
            st = new StringTokenizer(br.readLine());
            
            // 바꿀 공 넘버 2개 지정
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            // num1, num2 두개 바꿈
            // -1을 한 이유는 index로 접근하여 0부터 시작하기 때문이다.
            int t = basket[num1-1];
            basket[num1-1] = basket[num2-1];
            basket[num2-1] = t;
        }
        for (int i=0; i<basket.length; i++) {
            sb.append(basket[i] + " ");
        }
        bw.write(sb+"\n");
        bw.flush();
    }
}