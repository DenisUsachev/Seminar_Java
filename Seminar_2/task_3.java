/*Task_3

Для того чтобы выходить в Интернет, каждому компьютеру присваивается так называемый IP-адрес. 
Он состоит из четырех целых чисел в диапазоне от 0 до 255, разделенных точками. 
В следующих трех строках показаны три правильных IP-адреса:

127.0.0.0
192.168.0.01
255.00.255.255
Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.
Входные данные
На вход программе подается строка длиной не более 15 символов, которая включает цифры и точки.

Выходные данные
Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.

Примечание:
У вас не получится просто так взять и создать строку, которая содержит точку. Иначе говоря строчка кода:

String s = ".";
просто на просто не сработает. Точнее сработает неверно. 
Для корректного создания строки, содержащей точку используйте экранирование.

String s = "\.";


192.168.1.2
Sample Output 1:

YES
Sample Input 2:

192.11.690.0
Sample Output 2:

NO
Sample Input 3:

67.67.67
Sample Output 3:

NO */
package Seminar_2;
import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); 
        
        System.out.printf("IP: ");
        String ip = iScanner.nextLine();
        String[] new_ip = ip.split("\\.");
        if(new_ip.length == 4){
            for (int i = 0; i < new_ip.length; i++) {
                int arr = i;
                if(0 > arr && arr > 255){
                    System.out.println("No");
                    break;
                }
            }
            System.out.println("Yes");
        }else{System.out.println("No");}     
    }
}

