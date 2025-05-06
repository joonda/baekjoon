import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String j = br.readLine();
        String d = br.readLine();

        int jNum = 0, dNum = 0;

        for (int i = 0; i < j.length(); i++) {
            jNum++;
        }

        for (int i = 0; i < d.length(); i++) {
            dNum++;
        }

        if (jNum < dNum) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    }
}