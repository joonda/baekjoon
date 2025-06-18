import java.io.BufferedReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
    int b = Integer.parseInt(br.readLine());

    System.out.println(Math.round(b / 1.1));
  }
}