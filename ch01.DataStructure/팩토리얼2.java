import java.util.Scanner;

public class 팩토리얼2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(fac(N));
        sc.close();
    }

    public static long fac(int num) {
        if(num <= 0) {
            return 1;
        }

        return num*fac(num-1);
    }
}
