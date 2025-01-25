import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        // 낮에 올라가는 미터 (거리)
        int A = Integer.parseInt(st.nextToken());

        // 밤에 떨어지는 미터 (거리)
        int B = Integer.parseInt(st.nextToken());

        // 나무 막대의 미터
        int V = Integer.parseInt(st.nextToken());

        // V-A는 마지막 날에 올라가는 A 미터를 제외한 거리
        // 따라서 V-A 거리만큼 매일 A-B 미터씩 올라가야 한다
        // V-A를 (A-B)로 나누면, 마지막 날을 제외한 날수를 계산할 수 있다
        int day = (V-A) / (A-B); // V-A / (A-B)는 마지막 날을 제외한 올라가는 일수를 계산 (소수점을 버린다)
        if ((V-A) % (A-B) != 0) { // 소수점을 버리기 때문에, 나머지가 0이 아니라면 day를 더해준다.
            day++;
        }
        day++; // 마지막 날을 제외했기 때문에 하루를 더해준다.
        System.out.println(day);
    }
}