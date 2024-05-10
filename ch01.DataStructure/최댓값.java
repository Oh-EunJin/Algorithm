import java.util.Scanner;

public class 최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idx = 1;
        int num = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 9; i++) {
            num = sc.nextInt();
            if(max < num) {
                max = num;
                idx = i+1;
            }
        }

        System.out.println(max + "\n" + idx);

        sc.close();
    }
}
