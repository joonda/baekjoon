import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

		int[] line = new int[3];

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			line[0] = Integer.parseInt(st.nextToken());
			line[1] = Integer.parseInt(st.nextToken());
			line[2] = Integer.parseInt(st.nextToken());

			if (line[0] == 0 && line[1] == 0 && line[2] == 0) {
				break;
			}

			Arrays.sort(line);

			if (line[0] + line[1] <= line[2]) {
				System.out.println("Invalid");
				continue;
			}

			if (line[0] == line[1] && line[1] == line[2]) {
				System.out.println("Equilateral");
			} else if (line[0] == line[1] || line[1] == line[2] || line[0] == line[2]) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
		}
	}
}