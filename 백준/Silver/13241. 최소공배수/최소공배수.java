import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long a =	Integer.parseInt(st.nextToken());
		long b =	Integer.parseInt(st.nextToken());

		br.close();

		System.out.println(a * b / getGCD(a, b));
	}

	// 반복문 방식
	public static long getGCD(long a, long b) {
		while (b != 0) {
			long temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}