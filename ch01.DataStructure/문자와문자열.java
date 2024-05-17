import java.util.Scanner;

public class 문자와문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int i = sc.nextInt();

        System.out.println(s.substring(i-1, i));

        sc.close();
    }
}
