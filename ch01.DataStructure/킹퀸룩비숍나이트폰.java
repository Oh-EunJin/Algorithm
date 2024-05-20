import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 킹퀸룩비숍나이트폰 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int find[] = {1,1,2,2,2,8};
        int pick[] = new int[6];

        for(int i = 0; i < 6; i++) {
            int num = Integer.parseInt(st.nextToken());
            pick[i] = find[i] - num;
        }

        for(int i = 0; i < 6; i++) {
            System.out.print(pick[i] + " ");
        }

        if(br != null) br.close();
    }
}