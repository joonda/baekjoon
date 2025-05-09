import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());

            HashMap<Integer, Integer> map = new HashMap<>();
            PriorityQueue<Integer> minPQ = new PriorityQueue<>();
            PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

            for (int j = 0; j < k; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String command = st.nextToken();
                int n = Integer.parseInt(st.nextToken());

                if (command.equals("I")) {
                    map.put(n, map.getOrDefault(n, 0) + 1);
                    minPQ.add(n);
                    maxPQ.add(n);
                } else if (command.equals("D")) {
                    if (map.isEmpty()) continue;

                    if (n == -1) {
                        while (!minPQ.isEmpty()) {
                            int min = minPQ.poll();
                            if (map.containsKey(min)) {
                                map.put(min, map.get(min) - 1);
                                if (map.get(min) == 0) map.remove(min);
                                break;
                            }
                        }
                    } else {
                        while (!maxPQ.isEmpty()) {
                            int max = maxPQ.poll();
                            if (map.containsKey(max)) {
                                map.put(max, map.get(max) - 1);
                                if (map.get(max) == 0) map.remove(max);
                                break;
                            }
                        }
                    }
                }
            }

            // 최종 유효한 값 찾기
            while (!minPQ.isEmpty() && !map.containsKey(minPQ.peek())) {
                minPQ.poll();
            }
            while (!maxPQ.isEmpty() && !map.containsKey(maxPQ.peek())) {
                maxPQ.poll();
            }

            if (map.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                System.out.println(maxPQ.peek() + " " + minPQ.peek());
            }
        }
    }
}