import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최댓값2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int check[][] = new int[9][9];
        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;

        for(int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                check[i][j] = Integer.parseInt(st.nextToken());
                if(max < check[i][j]) {
                    max = check[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + col);


        if(br != null) br.close();
    }
}
