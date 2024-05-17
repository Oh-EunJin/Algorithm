import java.util.Arrays;
import java.util.Scanner;

public class 알파벳찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for(int i = 0; i < str.length(); i++) {
            if(alphabet[str.charAt(i)-97] == -1)
            alphabet[str.charAt(i)-97] = i;
        }

        for(int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }

        sc.close();
    }
}
