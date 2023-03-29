/*Task_4
Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n
n! = 1∙2∙3∙…∙ n.

Sample Input:                 Sample Output:
5                                  120*/

package Seminar_1;
import java.util.Scanner;
public class task4 {
    //Решение через рекурсию
    public static int fakt(int n) {
        if(n == 0){
            return 1;
        }else{
            return n * fakt(n - 1);
        }
    }
    //Обычное решение
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.printf("n: ");
            int n = iScanner.nextInt();
            int count = 1;
            for (int i = 2; i < n + 1; i++) {
                count *= i;
            }
            System.out.println(count);
            
            //Вывод через рекурсию
            System.out.println(fakt(n));
        }
    }
}