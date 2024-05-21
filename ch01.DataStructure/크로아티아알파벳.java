import java.util.Scanner;

public class 크로아티아알파벳 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String st[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i = 0; i < st.length; i++) {
            if(str.contains(st[i])) {
                str = str.replace(st[i], "0");
            }
        }

        System.out.println(str.length());

        sc.close();
    }
}
