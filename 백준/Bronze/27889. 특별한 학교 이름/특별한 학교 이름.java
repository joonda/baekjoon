import java.io.BufferedReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

    String school = br.readLine();

    if (school.equals("NLCS")) {
      System.out.println("North London Collegiate School");
    } else if (school.equals("BHA")) {
      System.out.println("Branksome Hall Asia");
    } else if (school.equals("KIS")) {
      System.out.println("Korea International School");
    } else if (school.equals("SJA")) {
      System.out.println("St. Johnsbury Academy");
    }
  }
}