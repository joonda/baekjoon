import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        br.close();

        // 대각선 번호
        int group = 1;

        // 대각선의 범위 (누적합)
        int range = 1;


        while (range < X) { // X가 속한 대각선을 찾기 위해 X가 누적합이 초과 될 때 까지 진행!
            group++; // group을 +1씩 진행
            range += group; // range에 group을 계속 더한다, X가 range를 초과할 때 까지!

//            System.out.println("group : " + group); // 디버깅용
//            System.out.println("range : " + range); // 디버깅용
        }
//        System.out.println("현재 대각선의 번호는 " + group + " 번째 입니다."); // 디버깅용
//        System.out.println("현재 대각선의 범위 (누적합은) " +range + " 까지 입니다."); // 디버깅용

        int position = X-(range-group); // X가 해당 group에서 몇번째 포지션인지 확인

        if (group % 2 == 1) { // group이 홀수 번째일때
            System.out.println((group-position+1)+"/"+position);
            // 분자는 group에서 1씩 감소 > position이 증가함에 따라 감소
            // 분모는 position을 따라간다.
        } else { // group이 짝수번째일때
            System.out.println(position + "/" + (group-position+1));
            // 분자는 position을 따라간다
            // 분모는 group에서 1씩 감소 > position이 증가함에 따라 감소
        }
    }
}