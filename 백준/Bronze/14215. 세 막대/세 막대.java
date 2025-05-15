import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		/*
		* 삼각형의 조건
		* 막대 길이가 a, b, c 일 때 (a <= b <= c)
		* a+b > c
		* 제일 긴 변을 제외한 나머지 두 변의 합이 제일 긴 변의 길이보다 커야한다.
		* */
		int[] triangles = new int[3];

		for (int i = 0; i < 3; i++) {
			triangles[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(triangles);

		int max = triangles[2];
		int sum = triangles[0] + triangles[1];
		int result;
		// 만약 두 변 길이의 합이 긴 변의 길이보다 크다면 삼각형이 만들어진다.
		if (sum > max) {
			result = sum+max;
			System.out.println(result);
			// 만약 아니라면, 제일 긴 변의 길이를 sum - 1 (삼각형의 조건을 충족 시키면서 제일 큰 둘레)
		} else {
			result = sum + sum-1;
			System.out.println(result);
		}
	}
}