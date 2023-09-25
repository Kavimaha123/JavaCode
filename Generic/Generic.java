package Generic;
import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String args[]){
        ArrayList list=new ArrayList();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        String fruit=(String)list.get(1);
        System.out.println(fruit);

    }
}
