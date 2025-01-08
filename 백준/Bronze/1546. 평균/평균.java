import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] score_array = new int[N];
        int max = 0;
        for (int i=0; i<N; i++) {
            int score = Integer.parseInt(st.nextToken());
            score_array[i] = score;

            if (max < score) {
                max = score;
            }
        }
        double sum = 0;

        for (int j=0; j<score_array.length; j++){
            double new_score = ((double)score_array[j] / max) * 100;
            sum += new_score;
        }
        bw.write((sum/N) + "\n");
        bw.flush();
    }
}