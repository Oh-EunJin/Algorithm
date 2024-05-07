import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 11720번
public class 숫자의합 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        String str = br.readLine();
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(str.substring(i, i+1));
            sum += num;
        }

        System.out.println(sum);
        br.close();
    }

}
