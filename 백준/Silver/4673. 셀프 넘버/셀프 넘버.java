import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    boolean[] constructArr = new boolean[10001];
    Arrays.fill(constructArr, false);
    constructArr[1] = false;

    for (int i = 1; i < 10001; i++) {
      String numChar = String.valueOf(i);
      int num = i;
      for (int j = 0; j < numChar.length(); j++) {
        num += numChar.charAt(j) - '0';
      }

      if (num < 10001) {
        constructArr[num] = true;
      }
    }

    for (int i = 1; i < 10001; i++) {
      if (!constructArr[i]) {
        System.out.println(i);
      }
    }
  }
}