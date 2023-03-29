/* Task_7
Дан список. Выведите те его элементы, которые встречаются в списке только один раз.
Элементы нужно выводить в том порядке, в котором они встречаются в списке.

Вводится список чисел. Все числа списка находятся на одной строке.

Sample Input:                       Sample Output:
    6                                     1
    1
    2
    2
    3
    3
    3                  */

package Seminar_1;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args){
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.printf("cnt: ");
            int cnt = iScanner.nextInt();
            int[] arr = new int[cnt];
            //int[] arr1 = new int[cnt];
            for (int i = 0; i < cnt; i++) {
                System.out.printf("Ввердите n: ");
                arr[i] = iScanner.nextInt();
            }for (int i = 0; i < cnt; i++) {
                System.out.println(arr[i] + " ");
            }for (int i = 0; i < cnt; i++) {
                for (int j = i + 1; j < cnt; j++) {
                    if (arr[i] == arr[j]){
                        continue;
                    }
                    else{
                        System.out.println(arr[i]);
                    }
                }
            }
        }
        System.out.println();
    }
}
