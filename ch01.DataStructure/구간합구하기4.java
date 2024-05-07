import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기4 {

    // 백준 11659번
    static int N, M;
    static int[] arr, sumArr;
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()) + 1;
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        sumArr = new int[N];
        st = new StringTokenizer(br.readLine());
        arr[0] = sumArr[0] = 0;
        for(int i = 1; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sumArr[i] = arr[i] + sumArr[i-1];
        }

        int start, end = 0;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            System.out.println(sumArr[end] - sumArr[start -1]);
        }

        br.close();
    }
    
}
