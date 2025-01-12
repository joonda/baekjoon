import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        double total_score = 0;
        double convert_grade = 0;
        double total_credit = 0;

        for (int i=0; i<20; i++) {

            st = new StringTokenizer(br.readLine());
            String title = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (!grade.equals("P")) {
                switch (grade) {
                    case "A+" -> convert_grade = 4.5;
                    case "A0" -> convert_grade = 4.0;
                    case "B+" -> convert_grade = 3.5;
                    case "B0" -> convert_grade = 3.0;
                    case "C+" -> convert_grade = 2.5;
                    case "C0" -> convert_grade = 2.0;
                    case "D+" -> convert_grade = 1.5;
                    case "D0" -> convert_grade = 1.0;
                    case "F" -> convert_grade = 0.0;
                }
                total_score += (credit * convert_grade);
                total_credit += credit;
            }
        }

        bw.write((total_score / total_credit) + "\n");
        bw.flush();
    }
}
