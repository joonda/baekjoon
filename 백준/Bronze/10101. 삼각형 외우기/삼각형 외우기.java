import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		int angle1 = Integer.parseInt(br.readLine());
		int angle2 = Integer.parseInt(br.readLine());
		int angle3 = Integer.parseInt(br.readLine());

		int sum = angle1 + angle2 + angle3;

		if (sum != 180) {
			System.out.println("Error");
			return;
		} else if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
			System.out.println("Equilateral");
		} else {
			if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
		}
	}
}