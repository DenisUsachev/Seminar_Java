/*Task_3
В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10%
от предыдущего значения. По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.

Программа получает на вход действительные числа x и y

Программа должна вывести одно натуральное число.
Sample Input:       Sample Output:
     10                   9
     20        */
package Seminar_1;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.printf("X: ");
            double x = iScanner.nextDouble();

            System.out.printf("y: ");
            int y = iScanner.nextInt();
            int day = 1;
            while (x <= y) {
                x += (x / 100 * 10);
                day++;
            }
            System.out.println(day);
        }
    }
}