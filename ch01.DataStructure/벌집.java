import java.util.Scanner;

public class 벌집 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 1;        // 거리
        int range = 2;      // 범위

        if(N == 1) {
            System.out.println(1);
        } else {
            while(range <= N) {
                range = range + (6 * cnt);
                cnt++;
            }
            System.out.println(cnt);
        }

        sc.close();
    }
}
