import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 커트라인 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Integer score[] = new Integer[N];
        
        for(int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(score, Collections.reverseOrder());

        System.out.println(score[cut-1]);

        if(br != null) br.close();
    }
}
