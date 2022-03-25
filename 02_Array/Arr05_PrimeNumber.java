import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Arr05_PrimeNumber {

   /* public int solution(int n) {
        int answer = 0;
        LinkedList<Integer> intArr = new LinkedList<Integer>();
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            intArr.add(i);
        }

        for (int i = 0; i < n-1; i++) {
            if (intArr.size() > 0) {
                int tmp = intArr.get(0);
                resultList.add(tmp);
                for (int j = 0; j < intArr.size(); j++) {
                    if (intArr.get(j) % tmp == 0) {
                        intArr.remove(j);
                    }
                }
            }
        }
        answer = resultList.size();
        return answer;
    }*/

    // 강의내용
    public int solution(int n) {
        int answer = 0;
        int[] intArr = new int[n+1];

        for (int i = 2; i < n+1; i++) {
            if (intArr[i] == 0) {
                answer++;
                for (int j = i; j < n+1; j = j + i) {
                    intArr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Arr05_PrimeNumber T = new Arr05_PrimeNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(T.solution(n));
    }
}