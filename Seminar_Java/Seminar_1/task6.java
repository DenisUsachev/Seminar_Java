/*Task_6
Вводится массив (сначала количество элементов, потом сами элементы).
Найдите сумму его элементов с чётными индексами и выведите её.
А потом выведите числа, которые суммировались.

Sample Input:           Sample Output:
    4                         4
    1                         1
    2                         3
    3
    4             */
package Seminar_1;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args){
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.printf("cnt: ");
            int cnt = iScanner.nextInt();
            int[] arr = new int[cnt];
            
            for (int i = 0; i < cnt; i++) {
                System.out.printf("Ввердите n: ");
                arr[i] = iScanner.nextInt();
            } int summ = 0;
            for (int i = 0; i < cnt; i++) {
                System.out.println(arr[i] + " ");
                if(i % 2 == 0){
                    summ += arr[i];
                }
            } System.out.println(summ);
        }
    }
}
