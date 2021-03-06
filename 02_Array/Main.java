import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] intArr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                /*if (i-1 > -1 && i+1 < n) {

                }*/
                if (intArr[i][j] < intArr[i-1][j]) {
                    continue;
                } else if (intArr[i][j] < intArr[i][j-1]) {
                    continue;
                } else if (intArr[i][j] < intArr[i][j+1]) {
                    continue;
                } else if (intArr[i][j] < intArr[i+1][j]) {
                    continue;
                } else {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] intArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                intArr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, intArr));
    }
}