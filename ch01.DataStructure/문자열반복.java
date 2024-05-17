import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열반복 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int R = 0;
        String str = "";
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            str = st.nextToken();
            String newStr = "";

            for(int s = 0; s < str.length(); s++) {
                char c = str.charAt(s);

                for(int r = 0; r < R; r++) {
                    newStr += c;
                }
            }

            System.out.println(newStr);
        }

        if(br != null) br.close();
    }
}
