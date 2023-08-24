package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ListOfString {
    public static void main(String args[]){
    ArrayList<String> list=new ArrayList<>();
    list.add("Mahadhevan");
    list.add("Vijay");
    list.add("Kavi");
    list.add("Ajay");
    list.add("Ram");
    for(String a:list){
    System.out.println(a);
    }
    Collections.sort(list);
    for(String a:list){
    System.out.println(a);
    }
    Collections.sort(list,Collections.reverseOrder());
    for(String a:list){
    System.out.println(a);
    }
        
}
}
