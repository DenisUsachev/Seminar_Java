/*task_2

Формат входных данных:
На первой строке вводится любимая буква Маши, на второй - Олега. Затем вводится строка,
в которой перечислены слова, которые написаны в газете.

Формат выходных данных:
На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.

Sample Input:

а
в
Автокатастрофа анклав вилка Ванна 
Шкаф Вагон Азов веранда
Sample Output:

7
5*/
package Seminar_2;
import java.util.Scanner;
public class task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); 
        
        System.out.printf("a: ");
        String a = iScanner.nextLine();
        String[] first = a.split(" ");

        System.out.printf("b: ");
        String b = iScanner.nextLine();
        String[] second = b.split(" ");
        
        System.out.println(first.length);
        System.out.println(second.length);
    }
}
