import java.util.Scanner;

public class 과제안내신분 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 28;
        int student[] = new int[31];

        for(int i = 1; i <= N; i++) {
            student[sc.nextInt()] = 1;
        }

        for(int i = 1; i <= 30; i++) {
            if(student[i] == 0)
                System.out.println(i);
        }

        sc.close();
    }
}
