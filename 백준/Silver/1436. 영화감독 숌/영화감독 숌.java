import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        // movieName인 666을 지정
        int movieName = 666;
        // count를 지정
        int count = 1;

        // count가 N보다 커질때까지 반복
        while (N > count) {

            // 영화이름을 1씩 지속적으로 더한다
            movieName++;

            // 영화 이름안에 666이 들어가면, count를 1씩 더한다.
            if (String.valueOf(movieName).contains("666")) {
                count++;
            }
        }

        System.out.println(movieName);
    }
}
