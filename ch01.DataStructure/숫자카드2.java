import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 숫자카드2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Map<String, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < N; i++) {
            String cardNum = st.nextToken();

            if(map.containsKey(cardNum)) {
                map.put(cardNum, map.get(cardNum)+1);
            } else {
                map.put(cardNum, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            String cardNum = st.nextToken();

            if(map.containsKey(cardNum)) {
                sb.append(map.get(cardNum) + " ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb.toString());

        if(br != null) br.close();
    }
}
