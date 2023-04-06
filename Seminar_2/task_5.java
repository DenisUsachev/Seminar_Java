/*Task_5
Вводится строка, определите, каких символов в ней больше: цифр или букв?
Напоминаю, что знаки препинания и пробелы, например. не являются ни тем ни другим.
Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter".
Если же их равное количество, то выведите слово "Equal".

Sample Input:

34Hi56
Sample Output:

Digit */
package Seminar_2;
import java.util.Scanner;
public class task_5 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); 
        
        System.out.printf("Введите текст: ");
        String text = iScanner.nextLine().toLowerCase();

        int digCnt = 0;
        int alCnt = 0;

        for (int i = 0; i < text.length(); i++) {
            char item = text.charAt(i); // перевод из строки в символ
            if (Character.isDigit(item)) digCnt++; // функция которая проверяет является ли символ-числои и если да то cnt++
            if (Character.isLetter(item)) alCnt++; // функция которая проверяет является ли символ-буквой и если да то cnt++
            
            // метод преподавателя
            if (text.charAt(i) >= '0' && text.charAt(i) <= '9') digCnt ++;
            else if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') alCnt ++;

        }
        if (digCnt > alCnt) System.out.println("Digit"); // сравнивает
        else if (digCnt < alCnt) System.out.println("Alpha");
        else System.out.println("Equal");
    }
}
