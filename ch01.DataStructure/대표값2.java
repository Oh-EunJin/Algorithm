import java.util.Arrays;
import java.util.Scanner;

public class 대표값2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 5;
        int arr[] = new int[N];
        int avg = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            avg += arr[i];
        }
        avg = avg / 5;

        Arrays.sort(arr);
        System.out.println(avg + "\n" + arr[2]);

        sc.close();
    }
}
