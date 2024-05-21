import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 그룹단어체커 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[26];
        String str = "";
        boolean flag = true;
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            Arrays.fill(arr, 0);
            str = br.readLine();
            flag = true;
            arr[str.charAt(0)-97]++;

            for(int j = 1; j < str.length(); j++) {
                if(!str.substring(j-1,j).equals(str.substring(j,j+1)) && arr[str.charAt(j)-97] > 0) {
                    flag = false;
                    break;
                } else {
                    arr[str.charAt(j)-97]++;
                }
            }

            if(flag) cnt++;
        }

        System.out.println(cnt);

        if(br != null) br.close();
    }
}