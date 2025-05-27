import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		StringTokenizer st2 = new StringTokenizer(br.readLine());

		int c = Integer.parseInt(st2.nextToken());
		int d = Integer.parseInt(st2.nextToken());

		// 분자
		int mole = a * d + b * c;

		// 분모
		int deno = b * d;

		// 최대 공약수를 구함
		int g = getGCD(mole, deno);

		// 최대 공약수로 분자, 분모를 나누면 기약분수가 된다.
		System.out.println(mole / g + " " + deno / g);
	}

	public static int getGCD(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}

		return a;
	}
}