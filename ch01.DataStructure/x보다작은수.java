import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class x보다작은수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());
            if(num < X)
                sb.append(num + " ");
        }

        System.out.println(sb.toString());


        if(br != null) br.close();
    }
}
