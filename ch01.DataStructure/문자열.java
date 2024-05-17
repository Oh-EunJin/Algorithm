import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문자열 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String str = br.readLine();
            String s = str.substring(0,1) + str.substring(str.length()-1, str.length());

            System.out.println(s);
        }

        br.close();
    }
}
