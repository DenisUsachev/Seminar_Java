/*Дана строка, в которой через пробел перечислены цифры.
На следующей строке вводятся цифра. Определите индексы первого и последнего её вхождения

Ввод:
4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7 
4
Вывод

0
28
*/
package Seminar_2;
import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
        String nums = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
        System.out.println(nums);
        Scanner iScanner = new Scanner(System.in); 
        System.out.printf("n: ");
        String n = iScanner.next();
        int first_num = nums.indexOf(n);
        int last_num = nums.lastIndexOf(n);
        System.out.println(first_num + "\n" + last_num);
    }
}
