import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int answer = 0;
		for (int i = 0; i < m-1; i++) {
			if (s.charAt(i) == 'I') {
				int count = 0;

				while (i+1 < m && s.charAt(i+1) == 'O' && i+2 < m && s.charAt(i+2) == 'I') {
					count++;
					i+=2;

					if (count == n) {
						answer++;
						count--;
					}
				}
			}
		}
		System.out.println(answer);
	}
}
