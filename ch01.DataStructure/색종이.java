import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] paper = new int[100][100];
        int N = Integer.parseInt(br.readLine());
        int area = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());

            for(int r = row-1; r < row+9; r++) {
                for(int c = col-1; c < col+9; c++) {
                    paper[r][c] = 1;
                }
            }
        }

        for(int r = 0; r < 100; r++) {
            for(int c = 0; c < 100; c++) {
                if(paper[r][c] == 1) {
                    area++;
                }
            }
        }

        System.out.println(area);

        if(br != null) br.close();
    }
}
