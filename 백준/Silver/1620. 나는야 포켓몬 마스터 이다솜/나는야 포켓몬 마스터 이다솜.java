import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> numtopokemon = new HashMap<>();
        HashMap<String, Integer> pokemontonum = new HashMap<>();

        for (int i=1; i<=N; i++) {
            String poke = br.readLine();
            numtopokemon.put(i, poke);
            pokemontonum.put(poke, i);
        }

        for (int j=0; j<M; j++) {
            String query = br.readLine();

            if (Character.isDigit(query.charAt(0))) {
                sb.append(numtopokemon.get(Integer.parseInt(query))).append("\n");
            } else {
                sb.append(pokemontonum.get(query)).append("\n");
            }
        }
        System.out.println(sb);
    }
}