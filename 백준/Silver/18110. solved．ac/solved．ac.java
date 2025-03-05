import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // input n 확인
		int n = Integer.parseInt(br.readLine());
        // 상위 15%, 하위 15%로 자를 기준
		int percentage = (int)Math.round(n * 0.15);
        // Generic List 선언 후, list add
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
        
        // list를 정렬
		Collections.sort(list);
        
        // subList로 상위 15%, 하위 15%를 자른다.
		List<Integer> sub = list.subList(percentage, (n-percentage));
       
		int sum = 0;
		for (int j=0; j<sub.size(); j++) {
			sum += sub.get(j);
		}
        
		float avg = (float) (sum / (float)sub.size());
		int roundAvg = Math.round(avg);
		System.out.println(roundAvg);
	}
}
