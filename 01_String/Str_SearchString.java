import java.util.Scanner;

public class Str_SearchString {
    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        /*for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                answer += 1;
            }
        }*/
        for (char x : str.toCharArray()) {
            if (x == c) {
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Str_SearchString T = new Str_SearchString();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);

        int result = T.solution(str, c);

        System.out.println(result);
    }
}
