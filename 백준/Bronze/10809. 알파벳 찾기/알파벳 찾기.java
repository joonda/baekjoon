import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[] alphabetArray = new int[26];

        for (int i=0; i<alphabetArray.length; i++) {
            alphabetArray[i] = -1;
        }

        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        for (int i=0; i<str.length(); i++) {
            char s = str.charAt(i);
            int idx = s-97;

            if (alphabetArray[idx] == -1) {
                alphabetArray[idx] = i;
            }
        }

        for (int i=0; i<alphabetArray.length; i++) {
            bw.write(alphabetArray[i] + " ");
            bw.flush();
        }

        }
    }