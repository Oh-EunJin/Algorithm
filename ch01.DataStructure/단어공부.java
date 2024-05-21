import java.util.Scanner;

public class 단어공부 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toUpperCase();
        int[] arr = new int[26];
        int max = Integer.MIN_VALUE;

        if(str.length() == 1) {
            System.out.println(str);
        } else {
            for(int i = 0; i < str.length(); i++) {
                arr[str.charAt(i)-65]++;
    
                if(max < arr[str.charAt(i)-65])
                    max = arr[str.charAt(i)-65];
            }
        }

        int second = 0;
        char result = ' ';
        for(int i = 0; i < arr.length; i++) {
            if(max == arr[i]) {
                second++;
                result = (char) ((i+65));
            }

            if(second > 1) {
                result = '?';
                break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}
