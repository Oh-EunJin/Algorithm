import java.io.*;

public class 숫자의합_11720 {

    static int N, sum;
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("11720.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sum = 0;
        N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(str.substring(i, i+1));
        }
        System.out.println(sum);

        br.close();
    }
}
