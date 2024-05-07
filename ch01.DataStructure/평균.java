import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 1546번
public class 평균 {
    static int N, max, sum;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 최댓값 구하기
        max = Integer.MIN_VALUE;
        sum = 0;
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(max < num) max = num;
            sum += num;
        }

        float avg = (float)sum / (float)(max * N) * 100;
        
        System.out.println(avg);
        br.close();
    }
}
