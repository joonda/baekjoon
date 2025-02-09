import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        int num = 0;
        if (isNumber(s1)) {
            num = Integer.parseInt(s1)+3;
        }
        if (isNumber(s2)) {
            num = Integer.parseInt(s2)+2;
        }

        if (isNumber(s3)) {
            num = Integer.parseInt(s3)+1;
        }

        if ((num % 3 == 0) && (num % 5 == 0)) {
            System.out.println("FizzBuzz");
        } else if ((num % 3 == 0) && (num % 5 != 0)) {
            System.out.println("Fizz");
        } else if ((num % 3 != 0) && (num % 5 == 0)) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }

    public static boolean isNumber(String str) {
        return str.matches("[+-]?\\d*(\\.\\d+)?");
    }
}