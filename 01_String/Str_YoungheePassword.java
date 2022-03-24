import java.util.Scanner;

public class Str_YoungheePassword {
    public String solution(String s, int strCnt) {
        String answer = "";
        int lt = 0;
        int rt = 7;
        String tmp = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strCnt; i++) {
            tmp = s.substring(lt, rt).replace("#", "1").replace("*","0");
            int intTmp = Integer.parseInt(tmp, 2);
            sb.append((char)intTmp);
            lt += 7;
            rt += 7;
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        Str_YoungheePassword T = new Str_YoungheePassword();
        Scanner kb = new Scanner(System.in);
        int strCnt = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(str, strCnt));
    }
}
