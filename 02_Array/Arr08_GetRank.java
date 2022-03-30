import java.util.Scanner;

public class Arr08_GetRank {

    public int[] solution(int n, int[] intArr) {
        int[] answer = new int[n];
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            cnt = 1;
            for (int j = 0; j < n; j++) {
                if (intArr[i] < intArr[j]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Arr08_GetRank T = new Arr08_GetRank();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = kb.nextInt();
        }
        int[] result = T.solution(n, intArr);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}