
package Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class task_4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        printresultOfCheck(list);

    }   
    
    public static void printresultOfCheck(List<String>list){
        Iterator<String> iterator = list.iterator(); // iterator - специальный объект в коллекции (имеет доступ ко всем данным и знает внутренную структуру) 
        while (iterator.hasNext()) { //пока есть следующий элемент
            String element = iterator.next();
            try {
                Integer.parseInt(element); 
                System.out.println(element + "int");
            } catch (NumberFormatException e) { // исключение
                System.out.println(element + "string");
            }
        }        
    }
}