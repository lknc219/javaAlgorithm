import java.util.Scanner;

public class Arr01_PrintLargeNumber {
    public String solution(int n, int[] intArr) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        sb.append(intArr[0]);
        for (int i = 1; i < n; i++) {
            if(intArr[i-1] < intArr[i]) {
                sb.append(" "+intArr[i]);
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        Arr01_PrintLargeNumber T = new Arr01_PrintLargeNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, intArr));
    }
}