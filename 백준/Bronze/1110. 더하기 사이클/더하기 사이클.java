import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String num = st.nextToken();

        if (num.length() == 1) {
            num = "0" + num;
        }
        String original = num;
        String newNumber = num;
        int count = 0;

        do {
            int sum = (newNumber.charAt(0) - '0') + (newNumber.charAt(1) - '0');
            newNumber = "" + newNumber.charAt(1) + (sum % 10);
            count++;
        } while (!newNumber.equals(original));

        System.out.println(count);
    }
}
