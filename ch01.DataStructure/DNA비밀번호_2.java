import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DNA비밀번호_2 {

    static int S, P, Result, checkSecret;
    static int[] checkArr, myArr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        S = Integer.parseInt(st.nextToken());       // 임의로 만든 DNA 문자열 길이
        P = Integer.parseInt(st.nextToken());       // 비밀번호로 사용할 부분문자열의 길이
        Result = 0;                                 // 조건을 만족하여 만들 수 있는 비밀번호 종류의 수

        // 부분문자열에 포함되어야 할 {'A', 'C', 'G', 'T'} 의 최소 개수
        checkArr = new int[4];                      // 비밀번호 체크 배열
        myArr = new int[4];                   // 현재 상태 배열
        char A[] = new char[S];                     // 문자열 데이터
        checkSecret = 0;                        // 몇 개의 문자와 관련된 개수를 충족했는지 판단하는 변수

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0) {
                checkSecret++;
            }
        }

        // 부분문자열 처음 받을 때 세팅
        for(int i = 0; i < P; i++) {
            Add(A[i]);
        }
        
        if(checkSecret == 4) Result++;

        // 슬라이딩 윈도우
        for(int i = P; i < S; i++) {
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4) Result++;
        }

        System.out.println(Result);

        if(br != null) br.close();
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }
    
    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }
}
