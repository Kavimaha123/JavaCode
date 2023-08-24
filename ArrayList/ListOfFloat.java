package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListOfFloat {
    public static void main(String args[]){
        ArrayList<Float> list=new ArrayList<>();
        list.add(2.1f);
        list.add(3.12f);
        list.add(4.123f);
        list.add(8.1234f);
        list.add(7.12345f);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


    }
    
}
