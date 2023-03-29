/*Task_5
Напишите программу, которая выводит в столбик целые числа от a до b (a >= b) с шагом c. Границы включаются.

Заданы три целых числа а, b, с, где a > b

Выведите единственное число - ответ на задачу.

Sample Input:              Sample Output:
    20                  20 18 16 14 12 10 8 6 4 2
    1
    2          */
    
package Seminar_1;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.printf("a: ");
            int a = iScanner.nextInt();

            System.out.printf("b: ");
            int b = iScanner.nextInt();

            System.out.printf("c: ");
            int c = iScanner.nextInt();
            for (int i = a; i > b; i -= c) {
                System.out.println(i);
            }
        }
    }
}
