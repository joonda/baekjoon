import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int receipt_sum = in.nextInt();
        int product_cnt = in.nextInt();
        int predict_sum = 0;

        for (int i = 0; i < product_cnt; i++) {
            int price = in.nextInt();
            int cnt = in.nextInt();

            predict_sum += (price * cnt);
        }
        if (receipt_sum == predict_sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        in.close();
    }
}