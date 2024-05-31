import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 개미굴 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int foodCnt = 0;


        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            foodCnt = Integer.parseInt(st.nextToken());

            

        }


        br.close();
    }
}
