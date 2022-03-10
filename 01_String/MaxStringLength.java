import java.util.Scanner;

public class MaxStringLength {
    public String solution(String str) {
        String answer = "";
        String[] strSp = str.split(" ");
        for (String x:strSp) {
            if (answer.length() < x.length()) {
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MaxStringLength T = new MaxStringLength();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}
