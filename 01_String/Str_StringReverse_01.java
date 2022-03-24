import java.util.Scanner;

public class Str_StringReverse_01 {
    public void solution(String[] strArr) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (String x : strArr) {
            for (int i = 0; i < x.length(); i++) {
                sb.append(x.charAt(x.length()-i-1));
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }

    public static void main(String[] args) {
        Str_StringReverse_01 T = new Str_StringReverse_01();
        Scanner kb = new Scanner(System.in);

        int count = kb.nextInt();
        String[] strArr = new String[count];

        for (int i = 0; i < count; i++) {
            strArr[i] = kb.next();
        }
        T.solution(strArr);
    }
}
