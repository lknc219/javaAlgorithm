import java.util.Scanner;

public class Str_RemoveDupChar {
    /*public String solution(String str) {
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
    }*/

    public String solution(String str) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                sb.append(str.charAt(i));
            }
        }

        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        Str_RemoveDupChar T = new Str_RemoveDupChar();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
