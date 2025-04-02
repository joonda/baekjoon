import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	static int[][] paper;
	static int whiteCount = 0;
	static int blueCount = 0;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		paper = new int[N][N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		divide(0, 0, N);

		System.out.println(whiteCount);
		System.out.println(blueCount);
}
public static boolean checkColor(int x, int y, int size) {
		int color = paper[x][y];
		for (int k = x; k < x+size; k++) {
			for (int l = y; l < y+size; l++) {
				if (paper[k][l] != color) {
					return false;
				}
			}
		}
		return true;
	}

	public static void divide(int x, int y, int size) {
		if (checkColor(x, y, size)) {
			if (paper[x][y] == 0) {
				whiteCount++;
			} else {
				blueCount++;
			}
			return;
		}
		int newSize = size / 2;
		divide(x, y, newSize);
		divide(x, y + newSize, newSize);
		divide(x+newSize, y, newSize);
		divide(x+newSize, y+newSize, newSize);
	}
}