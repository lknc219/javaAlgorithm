import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int n, int[] intArrA, int[] intArrB) {
        ArrayList<String> answer = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            int tmp = intArrA[i] - intArrB[i];
            switch (tmp) {
                case 1:
                    answer.add("A");
                    break;
                case -1:
                    answer.add("B");
                    break;
                case 2:
                    answer.add("B");
                    break;
                case -2:
                    answer.add("A");
                    break;
                case 0:
                    answer.add("D");
                    break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] intArrA = new int[n];
        int[] intArrB = new int[n];

        for (int i = 0; i < n; i++) {
            intArrA[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            intArrB[i] = kb.nextInt();
        }
        ArrayList<String> strArr = T.solution(n, intArrA, intArrB);
        for (int i = 0; i < strArr.size(); i++) {
            System.out.println(strArr.get(i));
        }
    }
}