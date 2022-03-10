import java.util.Scanner;

public class NumberExtraction {
    public int solution(String str) {
        str = str.toUpperCase().replaceAll("[^0-9]","");
        if (str.length() > 9) {
            str = str.substring(0,10);
        }
        int answer = Integer.valueOf(str);

        return answer;
    }

    // 강의 내용
    public int solution2(String str) {
        int answer = 0;
        for (char x : str.toCharArray()) {
            if(x >= 48 && x <= 57) answer = answer * 10 + (x-48);
        }
        return answer;
    }

    public static void main(String[] args) {
        NumberExtraction T = new NumberExtraction();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}
