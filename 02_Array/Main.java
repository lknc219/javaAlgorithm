import java.util.Scanner;

public class Main {

    public int solution(int[] intArr) {
        int answer = 0;
        int chkScore = 1;
        for (int x :intArr) {
            if (x == 1) {
                answer += chkScore;
                chkScore++;
            } else if (x == 0) {
                chkScore = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = kb.nextInt();
        }
        System.out.println(T.solution(intArr));
    }
}