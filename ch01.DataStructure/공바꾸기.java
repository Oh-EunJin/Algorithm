import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class 공바꾸기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());       // 바구니 개수
        int M = Integer.parseInt(st.nextToken());       // 공 바꾸는 횟수

        int basket[] = IntStream.range(0, N+1).toArray();
        int start,end,temp = 0;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            temp = basket[start];
            basket[start] = basket[end];
            basket[end] = temp;
        }

        for(int i = 1; i <= N; i++) {
            System.out.print(basket[i] + " ");
        }

        if(br != null) br.close();
    }
}
