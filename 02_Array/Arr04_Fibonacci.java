import java.util.ArrayList;
import java.util.Scanner;

public class Arr04_Fibonacci {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int p = 1;
        for (int i = 0; i < n; i++) {
            if (answer.size() >= 2) {
                p = answer.get(i - 1) + answer.get(i - 2);
            }
            answer.add(p);
        }
        return answer;
    }

    public static void main(String[] args) {
        Arr04_Fibonacci T = new Arr04_Fibonacci();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        ArrayList<Integer> intArr = T.solution(n);
        for (int x: intArr) {
            System.out.print(x + " ");
        }
    }
}
