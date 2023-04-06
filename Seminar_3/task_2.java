package Seminar_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); 
    
        System.out.printf("n: ");
        int n = iScanner.nextInt();
        List<String> lst = new ArrayList<>(n);
        for (int i = 0; i < n; i++) lst.add(String.valueOf(i)); 
        System.out.println(lst);
        
        System.out.printf("m: ");
        int m = iScanner.nextInt();
        System.out.printf("s: ");
        String s = iScanner.next();
        lst.add(m,s); // index(m), значение(s)
        System.out.println(lst);
    }
}
