/*Task_4

Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита. 
Найдите, сколько раз в тексте встречается введённый символ в любом регистре. 
Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.

Sample Input:

Good morning my dear friend. My fish.
m
Sample Output:

3 
*/
package Seminar_2;
import java.util.Scanner;
public class task_4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); 
        
        System.out.printf("Введите текст: ");
        String text = iScanner.nextLine().toLowerCase();

        System.out.printf("Введите букву: ");
        String letter = iScanner.nextLine().toLowerCase();

        // преобразование строки в символ
        char let = letter.charAt(0);

        int b = 0;
        for (int i = 0; i < text.length(); i++) {
            //сравнение символа с символом 
            if(text.charAt(i) == let) b ++;
        }
        System.out.println(b);
    }
}

