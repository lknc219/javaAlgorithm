import java.util.Scanner;

public class PalindromeCheck_01 {
    public String solution(String str) {
        str = str.toUpperCase(); // 대소문자 구분 X
        String answer = "YES";
        int lt = 0;
        int rt = str.length()-1;
        char[] chars = str.toCharArray();
        while (lt < rt) { // str.length()/2 로 for문 돌려도 됨.
            if (chars[lt] != chars[rt]){
                answer = "NO";
                break;
            }
            lt++;
            rt--;
        }
        return answer;
    }

    public static void main(String[] args) {
        PalindromeCheck_01 T = new PalindromeCheck_01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
