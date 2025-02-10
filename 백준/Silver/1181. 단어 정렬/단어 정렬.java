import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        // 단어를 넣을 가변 길이의 리스트 지정
        List<String> words = new ArrayList<>();

        // N개 만큼 반복, words array에 단어들을 넣는다.
        for (int i=0; i<N; i++) {
            words.add(br.readLine());
        }
        br.close();
        
        // 정렬 로직 정의
        words.sort((a, b) -> {
            // 단어 a, b 두개의 길이가 같다면
            if (a.length() == b.length()) {
                // a와 b를 사전순으로 정렬
                return a.compareTo(b);
                // 단어 a, b 두개의 길이가 다르다면
            } else {
                // 단어 a의 길이와 b의 길이를 비교한다.
                return Integer.compare(a.length(), b.length());
            }
        });

        // 중복된 단어를 제외하기 위해 distinct() 메서드 사용
        words = words.stream().distinct().collect(Collectors.toList());

        // 순차적 출력
        for (int i=0; i<words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}