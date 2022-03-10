import java.util.Scanner;

public class StringReverse_02 {
    public String solution(String str) {
        String answer;
        int lt = 0;
        int rt = str.length()-1;
        char[] charArr = str.toCharArray();
        while(rt > lt){
            if(!Character.isAlphabetic(charArr[lt])){
                lt++;
            } else if (!Character.isAlphabetic(charArr[rt])){
                rt--;
            } else {
                char tmp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(charArr);
        return answer;
    }

    public static void main(String[] args) {
        StringReverse_02 T = new StringReverse_02();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));

    }
}
