import java.util.Scanner;

public class 아스키코드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.nextLine().charAt(0);
        System.out.println(ch + 0);

        sc.close();
    }
}
