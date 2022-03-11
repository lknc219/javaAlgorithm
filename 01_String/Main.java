import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public String solution(String s, int strCnt) {
        String answer = "";
        int lt = 0;
        int rt = 7;
        String tmp = "";
        for (int i = 0; i < strCnt; i++) {
            tmp = s.substring(lt, rt).replace("#", "1").replace("*","0");
            int intTmp = Integer.parseInt(tmp, 10);
            System.out.println("intTmp = " + intTmp);
            lt += 7;
            rt += 7;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int strCnt = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(str, strCnt));
    }
}