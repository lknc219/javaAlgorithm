import java.util.ArrayList;
import java.util.Scanner;

public class Arr02_NumOfStudent {
    public int solution(int n, int[] intArr) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(intArr[0]);
        for (int i = 1; i < n; i++) {
            if (arrList.get(arrList.size()-1) < intArr[i]){
                arrList.add(intArr[i]);
            }
        }
        return arrList.size();
    }

    public static void main(String[] args) {
        Arr02_NumOfStudent T = new Arr02_NumOfStudent();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, intArr));
    }
}