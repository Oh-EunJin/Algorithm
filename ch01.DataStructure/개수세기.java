import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 개수세기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        String str = br.readLine();
        String findNum = br.readLine();

        int cnt = str.length() - str.replace(findNum, "").length();
        System.out.println(cnt);

        if(br != null) br.close();
    }
}
