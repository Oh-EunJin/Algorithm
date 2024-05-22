import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 달팽이 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());       // 낮에 올라갈 수 있는 거리
        int B = Integer.parseInt(st.nextToken());       // 밤에 미끄러지는 거리
        int V = Integer.parseInt(st.nextToken());       // 나무 막대의 높이
        int day = (V-B) / (A-B);

        // 나머지가 있는 경우
		if((V-B) % (A-B) != 0)
        day++;
    
        System.out.println(day);

        if(br != null) br.close();
    }
}
