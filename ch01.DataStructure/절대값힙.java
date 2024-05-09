import java.util.PriorityQueue;
import java.util.Scanner;

public class 절대값힙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> {
            
            int first_abs = Math.abs(a);
            int second_abs = Math.abs(b);

            // 절대값이 같은 경우 음수 우선
            if(first_abs == second_abs) {
                return a > b ? 1 : -1;
            }

            // 절대값 작은 데이터 우선
            return first_abs - second_abs;
        });

        for(int i = 0; i < N; i++) {
            int request = sc.nextInt();
            if(request == 0) {
                if(queue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(request);
            }
        }


        sc.close();
    }
}
