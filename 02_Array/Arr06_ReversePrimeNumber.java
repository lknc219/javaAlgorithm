import java.util.ArrayList;
import java.util.Scanner;

public class Arr06_ReversePrimeNumber {

    public ArrayList<Integer> solution(int n, int[] intArr) {

        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int x : intArr) {
            int result = reversePrimeNum(x);
            if (result != 0) {
                answer.add(result);
            }
        }
        return answer;
    }

    // 숫자 뒤집어서 소수면 그대로 반환, 아니면 0
    public int reversePrimeNum(int n) {
        int answer = 0;
        while (n != 0) {
            answer = answer * 10 + n % 10;
            n/=10;
        }
        if (answer < 2) {
            return 0;
        }
        for (int i = 2; i*i <= answer; i++) {
            if (answer % i == 0) {
                return 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Arr06_ReversePrimeNumber T = new Arr06_ReversePrimeNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = kb.nextInt();
        }
        ArrayList<Integer> list = T.solution(n, intArr);
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size()-1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}