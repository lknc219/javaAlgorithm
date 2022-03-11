import java.util.ArrayList;
import java.util.Scanner;

public class StringDistance {
    public ArrayList<Integer> solution(String s, char t) {
        char[] chars = s.toCharArray();
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt = 1000;

        for (char x : chars) {
            if(x == t) {
                cnt = 0;
                answer.add(cnt);
            } else {
                cnt++;
                answer.add(cnt);
            }
        }
        cnt = 1000;

        for (int i = 0; i < chars.length; i++) {
            int j = chars.length - 1 - i;
            char x = chars[j];
            if (x == t) {
                cnt = 0;
            } else {
                cnt++;
                answer.set(j, Math.min(answer.get(j), cnt));
                /*if (answer.get(j) > cnt){
                    answer.set(j, cnt);
                }*/
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StringDistance T = new StringDistance();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        char c = kb.next().charAt(0);
        ArrayList<Integer> intArr = T.solution(str, c);
        for (int x :intArr) {
            System.out.print(x + " ");
        }
    }
}
