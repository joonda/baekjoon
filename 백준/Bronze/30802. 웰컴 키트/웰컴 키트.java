import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] clothCount = new int[]{Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())};

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int totalBundles = 0;
        for (int i=0; i<clothCount.length; i++) {
            totalBundles += convertShirtBundles(clothCount[i], T);
        }

        int[] penResult = distributePens(N, P);

        System.out.println(totalBundles);
        System.out.println(penResult[0] + " " + penResult[1]);
    }

    public static int convertShirtBundles(int shirtCount, int shirtBundle) {
        int totalShirtBundles = shirtCount / shirtBundle;
        if ((shirtCount % shirtBundle) != 0) {
            totalShirtBundles++;
        }

        return totalShirtBundles;
    }

    public static int[] distributePens(int participants, int pens) {
        int bundles = participants / pens;
        int remainingPens = participants % pens;

        return new int[]{bundles, remainingPens};
    }
}