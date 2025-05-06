import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 2^N 크기의 배열
        int N = Integer.parseInt(st.nextToken());

        // 목표 위치 r행, c열
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // size.
        int size = (int) Math.pow(2, N);

        find(size, r, c);
        
        System.out.println(count);
    }

    private static void find(int size, int r, int c) {
        if (size == 1) return;

        // 왼쪽 위 사분면 (-, +)
        if (r < size/2 && c < size/2) {
            find(size/2, r, c);
        }

        // 오른쪽 위 사분면 (+, +)
        else if (r < size/2 && c >= size/2) {
            // 1사분면 다 지나옴
            count += size * size / 4;
            find(size/2, r, c - size/2);
        }

        // 왼쪽 아래 사분면 (-, -)
        else if (r >= size/2 && c < size/2) {
            // 1, 2사분면 다 지나옴
            count += (size * size / 4) * 2;
            find(size/2, r - size/2, c);
        }

        // 오른쪽 아래 사분면 (+, -)
        else {
            // 1, 2, 3사분면 다 지나옴
            count += (size * size / 4) * 3;
            find(size/2, r - size/2, c - size/2);
        }
    }
}