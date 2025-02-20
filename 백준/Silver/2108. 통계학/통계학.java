import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        System.out.println(mean(list));
        System.out.println(median(list));
        System.out.println(mode(list));
        System.out.println(range(list));
    }

    // 평균 값 구하는 로직
    public static int mean(List<Integer> list) {
        // 합을 구하는 정수를 선언
        int sum = 0;
        // sum에 list의 원소를 지속적으로 더한다.
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        // 반올림 or 반내림을 진행하기 위해 Math.round 함수 활용
        // double 타입으로 반환 후, round 활용하여 반올림, int로 반환 진행
        return (int) Math.round((double) sum / list.size());
    }

    // 중앙값 구하는 로직
    public static int median(List<Integer> list) {

        // list를 정렬시킨다.
        Collections.sort(list);

        // list의 중앙값을 return
        return list.get(list.size() / 2);
    }

    // 최빈값 구하는 로직
    public static int mode(List<Integer> list) {

        // 숫자와 그 숫자의 빈도수를 저장하는 Map 생성
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // 만약에 list의 길이가 1이면, 최빈값은 0번째 원소가 된다.
        if (list.size() == 1) {
            return list.get(0);
        }

        for (int i = 0; i < list.size(); i++) {
            // Map의 key에 만약 원소 값이 있다면.
            if (frequencyMap.containsKey(list.get(i))) {
                // 해당 원소 key 값에 value 값을 +1
                frequencyMap.put(list.get(i), frequencyMap.get(list.get(i)) + 1);
            } else {
                // 아니라면 key 값에 value 값을 1로 지정.
                frequencyMap.put(list.get(i), 1);
            }
        }

        // 빈도수 중 가장 큰 값을 찾음
        int maxValue = Collections.max(frequencyMap.values());

        // 빈도수가 최대인 숫자들을 리스트에 저장
        ArrayList<Integer> arrayList= new ArrayList<>();
        // Map.Entry -> Map에 저장된 모든 key-value 쌍을 각각의 key-value를 갖고 있는 하나의 객체
        // entrySet() -> [key=value, ... , ...], getKey(), getValue()로 각각의 값을 추출 가능
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            // entry의 getValue() 값이 이전에 지정한 최대 빈도수 값이면
            if (entry.getValue() == maxValue) {
                // 해당 entry의 Key 값을 List에 저장한다.
                arrayList.add(entry.getKey());
            }
        }
        
        // List를 정렬
        Collections.sort(arrayList);

        // 만약 list의 길이가 1 초과라면 (2, 3, ...)
        if (arrayList.size() > 1) {
            // 두 번째로 작은 값을 뽑아야하기 때문에, 1번째 index 값 return
            return arrayList.get(1);
        } else {
            // 만약 아니라면 (list의 길이가 1이라면) 0번째 index 값 return
            return arrayList.get(0);
        }
    }

    // 범위를 구하는 로직
    public static int range(List<Integer> list) {
        // list를 정렬
        Collections.sort(list);
        
        // list의 가장 마지막 원소에서 0번째 index 값을 뺀다.
        return (list.get(list.size()-1)) - list.get(0);
    }
}
