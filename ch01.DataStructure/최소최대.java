import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소최대 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int num = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            // arr[i] = Integer.parseInt(st.nextToken());
            num = Integer.parseInt(st.nextToken());
            if(max < num) max = num;
            if(min > num) min = num;
        }

        System.out.println(min + " " + max);

        if(br != null) br.close();
    }
}
