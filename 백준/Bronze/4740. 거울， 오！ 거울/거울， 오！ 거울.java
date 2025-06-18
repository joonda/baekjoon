import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();

    while(!s.equals("***")) {
      for (int n = s.length() - 1; n >= 0; n--) {
        System.out.print(s.charAt(n));
      }
      System.out.println();
      s = br.readLine();
    }
  }
}