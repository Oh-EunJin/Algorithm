import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 11720번
public class 숫자의합_2 {

    public static void main(String[] args) throws IOException {
        
        // 아스키코드는 숫자와 48차이 ("1" - 48 = 1)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String sNum = br.readLine();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for(int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
        br.close();
    }

}
