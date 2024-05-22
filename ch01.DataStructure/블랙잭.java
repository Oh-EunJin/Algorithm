import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 블랙잭 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] card = new int[N];
        for(int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        // 3장을 뽑아 M을 넘지 않으면서 최대한 가까운 합 구하기
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < N-2; i++) {
            for(int j = i+1; j < N-1; j++) {
                for(int k = j+1; k < N; k++) {
                    sum = card[i] + card[j] + card[k];

                    if((sum <= M) && ((M-maxSum) > (M-sum))) {
                        maxSum = sum;
                    }
                }
            }
        }
        
        System.out.println(maxSum);

        if(br != null) br.close();
    }
}
