package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ListOfInt {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(13);
        list.add(32);
        list.add(76);
        list.add(65);
        list.add(99);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
    
}
