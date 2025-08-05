import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String n = br.readLine();

    int[] arr = new int[10];

    for (int i = 0; i < n.length(); i++) {
      int c = n.charAt(i) - '0';
      arr[c]++;
    }

    int sixNine = arr[6] + arr[9];
    arr[6] = arr[9] = (sixNine + 1) / 2;

    int max = 0;
    for (int i = 0; i < 10; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println(max);
  }
}
