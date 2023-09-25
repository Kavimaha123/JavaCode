package Generic;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String args[]){
        LinkedList<String> linkedlist=new LinkedList<String>();
        linkedlist.add("vignesh");
        linkedlist.add("mahakavi");
        linkedlist.add("ms");
        Iterator<String> itr=linkedlist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
