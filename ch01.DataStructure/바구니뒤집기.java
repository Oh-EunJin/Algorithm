import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class 바구니뒤집기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());       // 바구니 개수
        int M = Integer.parseInt(st.nextToken());       // 바구니 뒤집는 횟수

        int basket[] = IntStream.range(0, N+1).toArray();
        int start, end, temp = 0;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            for(int j = 0; j < (end-start+1)/2; j++) {
                if(j == 0) {
                    temp = basket[start];
                    basket[start] = basket[end];
                    basket[end] = temp;
                } else {
                    temp = basket[start + j];
                    basket[start + j] = basket[end - j];
                    basket[end - j] = temp;
                }
            }
        }

        for(int i = 1; i <= N; i++) {
            System.out.print(basket[i] + " ");
        }

        if(br != null) br.close();
    }
}
