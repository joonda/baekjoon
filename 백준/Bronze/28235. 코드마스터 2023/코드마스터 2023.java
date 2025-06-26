import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String saying = br.readLine();

    if (saying.equals("SONGDO")) {
      System.out.println("HIGHSCHOOL");
    } else if (saying.equals("CODE")) {
      System.out.println("MASTER");
    } else if (saying.equals("2023")) {
      System.out.println("0611");
    } else if (saying.equals("ALGORITHM")) {
      System.out.println("CONTEST");
    }
  }
}