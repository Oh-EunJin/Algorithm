import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class 듣보잡 {

	static int N, M;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		Set<String> nolisten = new HashSet<String>();
		List<String> nolistenwatch = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			nolisten.add(br.readLine());
		}
		
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			
			if(nolisten.contains(str)) {
				nolistenwatch.add(str);
			}
		}
		
		Collections.sort(nolistenwatch);
		System.out.println(nolistenwatch.size());
		for (int i = 0; i < nolistenwatch.size(); i++) {
			System.out.println(nolistenwatch.get(i));
		}
		
		br.close();
	}

}