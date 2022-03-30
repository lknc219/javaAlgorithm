import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arr09_GratingSum {

    public int solution(int n, int[][] intArr) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int tmp1 = 0;
        int tmp2 = 0;
        int tmp3 = 0;
        int tmp4 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tmp1 += intArr[i][j];
                tmp2 += intArr[j][i];
            }
            list.add(tmp1);
            list.add(tmp2);
            tmp1 = 0;
            tmp2 = 0;

            tmp3 += intArr[i][i];
            tmp4 += intArr[i][n-1-i];
        }
        list.add(tmp3);
        list.add(tmp4);
        Collections.sort(list, Collections.reverseOrder());
        answer = list.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Arr09_GratingSum T = new Arr09_GratingSum();
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