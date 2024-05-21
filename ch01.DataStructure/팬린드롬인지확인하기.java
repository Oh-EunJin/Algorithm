import java.util.Scanner;

public class 팬린드롬인지확인하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int strLen = str.length();
        int idx = 0;
        int result = 1;
        
        while ((strLen/2) != idx) {
            if(!str.substring(idx, idx+1).equals(str.substring(strLen-idx-1, strLen-idx))) {
                result = 0;
                break;
            }
            idx++;
        }

        System.out.println(result);
        sc.close();
    }
}
