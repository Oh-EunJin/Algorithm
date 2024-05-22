import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 세로읽기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char charArr[][] = new char[5][15];
        for(int i = 0; i < 5; i++) {
            Arrays.fill(charArr[i], '.');
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 5; i++) {
            String str = br.readLine();
            for(int j = 0; j < str.length(); j++) {
                charArr[i][j] = str.charAt(j);
            }
        }

        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if(charArr[j][i] != '.')
                    sb.append(charArr[j][i]);
            }
        }

        System.out.println(sb.toString());
        
        if(br != null) br.close();
    }
}
