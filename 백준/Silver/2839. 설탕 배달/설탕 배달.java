import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        br.close();
        // N이 0보다 클 때 까지 반복
        while (N > 0) {
            // N이 5의 배수라면
            if (N % 5 == 0){
                // count에 N을 5로 나눈 값을 더한다.
                count += N / 5;
                break;
            } else {
                // 아니라면 3을 지속적으로 뺀다
                N -= 3;
                // count를 1씩 더한다. (3kg 봉투 개수를 추가)
                count++;
            }
            // 만약 N이 0보다 작다면 (딱 맞아야하기 때문에 -3을 계속해도 안맞으면 결국 N은 음수로 가게된다 (e.g. 4)
            if (N < 0) {
                count = -1;
            }
        }
        System.out.println(count);
    }
}
