package Seminar_4;
import java.util.*;
public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Сколько будет взаимодействий: ");
        int n = scanner.nextInt();
        
        Stack<String> clothes = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            
            System.out.printf("Введите, что делать(где push- добавить/ pop - надеть): ");
            String imput = scanner.next();

            if(imput.equals("push")){
                String imputClother = scanner.next();
                clothes.add(imputClother);
            }
            else if (imput.equals("pop")) System.out.println("Петя взял: " + clothes.pop());
        }
        System.out.println(clothes);
    }
}