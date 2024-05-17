import java.util.Scanner;

public class 다이얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] number = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
        int time = 0;

        for(int i = 0; i < str.length(); i++) {
            time += number[str.charAt(i)-65];
        }
        System.out.println(time);

        sc.close();
    }
}
