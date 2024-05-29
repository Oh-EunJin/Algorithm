import java.util.Scanner;
import java.util.Stack;

public class 제로 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        int sum = 0, price = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < T; i++) {
            price = sc.nextInt();
            sc.nextLine();

            if(price != 0) {
                stack.push(price);
            } else {
                stack.pop();
            }
        }

        for(Integer p : stack) {
            sum += p;
        }
        System.out.println(sum);

        sc.close();
    }
}
