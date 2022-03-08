import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (char x : str.toCharArray()) {
            if (Character.isUpperCase(x)) {
                sb.append(Character.toLowerCase(x));
            } else if (Character.isLowerCase(x)) {
                sb.append(Character.toUpperCase(x));
            }
            answer = sb.toString();
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
