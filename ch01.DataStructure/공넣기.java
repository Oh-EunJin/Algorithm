import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 공넣기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());       // 바구니 개수
        int M = Integer.parseInt(st.nextToken());       // 공 넣는 횟수

        int basket[] = new int[N+1];
        int start,end,ball = 0;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            ball = Integer.parseInt(st.nextToken());

            for(int j = start; j <= end; j++) {
                basket[j] = ball;
            }
        }

        for(int i = 1; i <= N; i++) {
            System.out.print(basket[i] + " ");
        }

        if(br != null) br.close();
    }
}
