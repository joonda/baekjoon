import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        // 주사위 3개의 눈이 모두 같은 경우.
        if ((A == B) && (A == C) && (B == C)) {
            System.out.println(10000 + (A * 1000));
        } else if ((A == B) || (A == C)) {
            System.out.println(1000 + (A * 100)); // 주사위 2개의 눈이 같은 경우
        } else if (B == C) {
            System.out.println(1000 + (B * 100)); // 나머지 주사위 2개의 눈이 같은 경우.
        } else { // 하나도 같지 않은 경우, 최대 값을 구한다.
            int max = A;
            int[] dice = {A, B, C};
            for (int i = 0; i < dice.length; i++) {
                if (dice[i] >= max) {
                    max = dice[i];
                }
            }
            System.out.println(max * 100);
        }
    }
}
