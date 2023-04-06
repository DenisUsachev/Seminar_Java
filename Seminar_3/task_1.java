package Seminar_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); 

        System.out.printf("n: ");
        int n = iScanner.nextInt();
        List<Integer> lst = new ArrayList<Integer>(n);
        lst.add(1);
        for (int i = 1; i <= n; i++) {
            lst.add(0);
        }
        lst.add(1);
        System.out.println(lst);
    }
}
