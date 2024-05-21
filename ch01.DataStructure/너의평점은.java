import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 너의평점은 {
    static int N = 20;
    static double AllScore = 0;
    static String subject = "";
    static double score = 0;
    static String grade = "";
    static double sum = 0;
    public static void main(String[] args) throws Exception {
        // 총점 = (학점 * 과목평점) / 학점총합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            subject = st.nextToken();
            score = Double.parseDouble(st.nextToken());
            grade = st.nextToken();

            if(!grade.equals("P"))
                sum += score;
            AllScore += calScore();
        }

        System.out.println(AllScore/sum);

        if(br != null) br.close();
    }

    private static double calScore() {
        double oneSubjectScore = 0;

        switch (grade) {
            case "A+":
                oneSubjectScore = score * 4.5;
                break;
            case "A0":
                oneSubjectScore = score * 4.0;
                break;
            case "B+":
                oneSubjectScore = score * 3.5;
                break;
            case "B0":
                oneSubjectScore = score * 3.0;
                break;
            case "C+":
                oneSubjectScore = score * 2.5;
                break;
            case "C0":
                oneSubjectScore = score * 2.0;
                break;
            case "D+":
                oneSubjectScore = score * 1.5;
                break;
            case "D0":
                oneSubjectScore = score * 1.0;
                break;
            case "P":
                oneSubjectScore = 0.0;
                break;
            case "F":
                oneSubjectScore = score * 0.0;
                break;
        }

        return oneSubjectScore;
    }
}
