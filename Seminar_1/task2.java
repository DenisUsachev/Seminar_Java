/*Task_2
Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, 
если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).

Вводятся 3 числа: n, m и k; 
k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.
Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.

Sample Input 1:                  Sample Output 1:
3 2 4                                 YES */

package Seminar_1;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.printf("n: ");
            int n = iScanner.nextInt();

            System.out.printf("m: ");
            int m = iScanner.nextInt();

            System.out.printf("k: ");
            int k = iScanner.nextInt();
            if (k != n * m && n * m < 30000) {
                System.out.println("Yes");    
            } else {
                System.out.println("No");
            }
        }

    }
}
