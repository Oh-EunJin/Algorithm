import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 세탁소사장동혁 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int price = 0;
        StringBuilder sb = new StringBuilder();

        // 25, 10, 5, 1
        for(int i = 0; i < N; i++) {
            price = Integer.parseInt(br.readLine());

            if(price >= 25) {
                sb.append(price/25 + " ");
                price = price % 25;
            } else {
                sb.append("0 ");
            }

            if(price >= 10) {
                sb.append(price/10 + " ");
                price = price % 10;
            } else {
                sb.append("0 ");
            }

            if(price >= 5) {
                sb.append(price/5 + " ");
                price = price % 5;
            } else {
                sb.append("0 ");
            }

            if(price >= 1) {
                sb.append(price + "\n");
                price = 0;
            } else {
                sb.append("0\n");
            }
        }

        System.out.println(sb.toString());

        if(br != null) br.close();
    }
}
