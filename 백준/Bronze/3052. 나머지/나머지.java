import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 점수를 저장할 List 선언 (제네릭 타입: Integer)
        List<Integer> score_list = new ArrayList<>();

        for (int i=0; i<10; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            // generic 배열에 나머지를 추가
            score_list.add(num % 42);
        }

        // 중복을 제거하기 위해 List를 Set으로 변환 (Set은 중복을 허용하지 않음)
        Set<Integer> set = new HashSet<>(score_list);

        // Set을 다시 List로 변환하여 유일한 나머지 값들로 구성된 리스트 생성
        List<Integer> uniqueList = new ArrayList<>(set);

        // 중복 제거된 나머지 값의 개수를 출력
        bw.write(uniqueList.size() + "\n");
        bw.flush();
    }
}