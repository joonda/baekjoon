import com.sun.jdi.IntegerValue;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken());

        bw.write(str.charAt(i-1) + "\n");
        bw.flush();
    }
}