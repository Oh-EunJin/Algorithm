import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class 포켓몬마스터 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // List<String> poketmon = new ArrayList<>();
        Map<String, Integer> poketmon = new LinkedHashMap();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            // poketmon.add(br.readLine());
            String name = br.readLine();
            poketmon.put(name, i+1);
            list.add(name);
        }

        for(int i = 0; i < M; i++) {
            String str = br.readLine();

            // if(poketmon.contains(str)) {
            //     System.out.println(poketmon.indexOf(str) + 1);
            // } else {
            //     System.out.println(poketmon.get(Integer.parseInt(str)-1));
            // }

            if(poketmon.containsKey(str)) {
                System.out.println(poketmon.get(str));
            } else {
                System.out.println(list.get(Integer.parseInt(str)-1));
            }
        }

        if(br != null) br.close();
    }
}
