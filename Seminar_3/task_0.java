/*

*/
package Seminar_3;

import java.util.ArrayList;
import java.util.List;

public class task_0 {
    public static void main(String[] args) {
        List <String> str = new ArrayList <String> (5);
        str.add("blue");
        str.add("yellow");
        str.add("green");
        str.add("red");
        str.add("perpull");
        for (String item : str) { // распаковываем
            System.out.println(item);
        }
        System.out.println(str.get(0)); // получить из списка элемент с индексом 0
        str.set(2, "red");
        str.remove("perpull");
        System.out.println(str.indexOf("blue"));
        System.out.println(str);
    }
}