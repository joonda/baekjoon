import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int min = A * 60 + B; // 시간과 분을 분으로 통일
        min = min + C; // 추가 시간 까지 더해서 분으로 통일.
        
        int hour = (min / 60) % 24;
        int minute = min % 60;
        
        System.out.println(hour+" "+minute);
    }
}
