import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class 수들의합5 {
    static int N, sIdx, eIdx, cnt, sum;
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        sIdx = eIdx = sum = cnt = 1;

        // int[] arr = new int[N];
        // Arrays.setAll(arr, i -> i+1);
        // int[] arr = IntStream.range(1, N).toArray();
        
        while(eIdx != N) {
            if(sum == N) {
                cnt++;
                eIdx++;
                sum += eIdx;
            } else if(sum < N) {
                eIdx++;
                sum += eIdx;
            } else {
                sum -= sIdx;
                sIdx++;
            }
        }

        System.out.println(cnt);

        if(br != null) {
            br.close();
        }
    }
}
