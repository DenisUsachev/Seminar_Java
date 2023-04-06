package Seminar_3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task_5 {
    //нужно удалить из него чётные значения
    public static List < Integer > removeEvenValue ( List < Integer > list) {
        List<Integer>item = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 != 0){
                item.add(list.get(i));   
            }
        }
        return item; 
    }

    //Нужно найти минимальное значение
    public static Integer getMin( List < Integer > list ) {
        return Collections.min(list);
    }

    //Найти максимальное значение
    public static Integer getMax( List < Integer > list ) {
        return Collections.max(list);
    }


    public static void main(String[] args) {
        List < Integer > list = new ArrayList<Integer>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(removeEvenValue(list));
        System.out.println(getMin(list));
        System.out.println(getMax(list));
        System.out.println(list.stream().mapToInt(Integer::intValue).average());
    }
}
