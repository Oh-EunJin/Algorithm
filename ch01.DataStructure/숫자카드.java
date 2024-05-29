import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class 숫자카드 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        // List<String> sangunCard = new ArrayList<>();
        Map<String, Integer> sangunCard = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            // sangunCard.add(st.nextToken());
            sangunCard.put(st.nextToken(), 0);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        // for(int i = 0; i < M; i++) {
        //     if(sangunCard.contains(st.nextToken())) {
        //         sb.append(1);
        //     } else {
        //         sb.append(0);
        //     }
        //     sb.append(" ");
        // }
        for(int i = 0; i < M; i++) {
            if(sangunCard.containsKey(st.nextToken())) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append(" ");
        }

        System.out.println(sb.toString());

        if(br != null) br.close();
    }
}
