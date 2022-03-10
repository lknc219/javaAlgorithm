import java.util.Scanner;

public class PalindromeCheck_02 {
    public String solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]",""); // 대소문자 구분 X
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        PalindromeCheck_02 T = new PalindromeCheck_02();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}
