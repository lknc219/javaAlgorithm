import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        ArrayList<Character> chars = new ArrayList<Character>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if(!chars.contains(c)){
                chars.add(c);
                sb.append(c);
            }
        }

        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}