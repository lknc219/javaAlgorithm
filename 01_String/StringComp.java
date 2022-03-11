import java.util.Scanner;

public class StringComp {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        char tmp = 0;
        int cnt = 1;

        for (char x : chars) {
            if (x != tmp) {
                if (cnt > 1) {
                    sb.append(cnt);
                    cnt = 1;
                }
                sb.append(x);
                tmp = x;
            } else {
                cnt++;
            }
        }
        if (cnt > 1) {
            sb.append(cnt);
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        StringComp T = new StringComp();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
