import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽_2 {
    static int N, M, cnt;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        cnt = 0;

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(arr);

        int sIdx = 0;
        int eIDx = N-1;

        while(sIdx < eIDx) {
            if(arr[sIdx] + arr[eIDx] < M) {
                sIdx++;
            } else if(arr[sIdx] + arr[eIDx] > M) {
                eIDx--;
            } else {
                cnt++;
                sIdx++;
                eIDx--;
            }
        }

        System.out.println(cnt);

        if(br != null) br.close();
    }
}
