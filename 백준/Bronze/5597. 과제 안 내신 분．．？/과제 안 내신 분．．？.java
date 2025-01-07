import com.sun.jdi.IntegerValue;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        // student 배열 객체 생성
        int[] student = new int[28];
        
        // 1~30번의 array로 구성된 student_full 배열 생성
        int[] student_full = IntStream.rangeClosed(1, 30).toArray();
        
        // 한 줄씩 받아오는 번호를 student 배열에 넣기 (숙제 낸 사람들만 필터링)
        for(int i=0; i<28; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            student[i] = N;
        }
        
        // 1~30까지 번호가 있는 배열에서 숙제 낸 사람들만 있는 배열의 차집합을 구하면, 안 낸 번호 2명을 확인가능
        int[] difference = Arrays.stream(student_full).
                filter(x -> Arrays.stream(student).
                        noneMatch(y-> y == x)).toArray();

        bw.write(difference[0] + "\n");
        bw.write(difference[1] + "\n");
        bw.flush();
    }
}