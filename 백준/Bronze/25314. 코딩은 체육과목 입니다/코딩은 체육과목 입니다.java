import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int cnt = N /= 4;
        String lng = "";
        for (int i = 0; i < cnt; i++) {
            lng += "long ";
        }
        System.out.println(lng + "int");
    }
}