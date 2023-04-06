package Seminar_4;
import java.util.*;
public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> musicList = new ArrayList<>(Arrays.asList("Trek1", "Trek2", "Trek3", "Trek4"));
        List<String> playList = new ArrayList<>();
        
        for (int i = 0; i < musicList.size(); i++) {
            
            System.out.println(musicList.get(i) + ": Что будем делать с треком?");
            String imput = scanner.next();
            if(imput.equals("push")) playList.add(musicList.get(i));
            else if (imput.equals("pop")) playList.remove(playList.get(0));
        }
        System.out.println(playList);
    }
}
