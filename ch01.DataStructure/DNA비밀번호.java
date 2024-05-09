import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 해당 방법은 시간초과..
public class DNA비밀번호 {

    static int S, P, cnt;
    static String DNA, password = "";
    static int[] arr;
    static boolean success;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        S = Integer.parseInt(st.nextToken());       // 임의로 만든 DNA 문자열 길이
        P = Integer.parseInt(st.nextToken());       // 비밀번호로 사용할 부분문자열의 길이
        DNA = br.readLine();                        // 임의로 만든 DNA 문자열
        cnt = 0;                                    // 조건을 만족하여 만들 수 있는 비밀번호 종류의 수

        st = new StringTokenizer(br.readLine());
        // 부분문자열에 포함되어야 할 {'A', 'C', 'G', 'T'} 의 최소 개수
        arr = new int[4];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        success = false;
        String str = "";
        int num = 0;
        for(int i = 0; i < S-P+1; i++) {
            password = DNA.substring(i,i+P);

            for(int j = 0; j < arr.length; j++) {
                if(j == 0) {
                    str = "A";
                    success = checkVal(str, num, j);
                    password = DNA.substring(i,i+P);
                    if(!success) break;
                } else if(j == 1) {
                    str = "C";
                    success = checkVal(str, num, j);
                    password = DNA.substring(i,i+P);
                    if(!success) break;
                } else if(j == 2) {
                    str = "G";
                    success = checkVal(str, num, j);
                    password = DNA.substring(i,i+P);
                    if(!success) break;
                } else {
                    str = "T";
                    success = checkVal(str, num, j);
                    password = DNA.substring(i,i+P);
                    if(!success) break;
                }

            }

            if(success) cnt++;
            success = false;
        }
        
        System.out.println(cnt);

        if(br != null) br.close();
    }

    public static boolean checkVal(String str, int num, int j) {
        num = password.length() - password.replace(str, "").length();
        if(arr[j] <= num)  {
            success = true;
        } else {
            success = false;
            return success;
        }

        return success;
    }
}
