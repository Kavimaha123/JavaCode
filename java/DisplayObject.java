import java.util.ArrayList;
import java.util.Vector;

public class DisplayObject {
    public static void main(String args[]){
        Object obj=new ArrayList();
        displayObjectClass(obj);
    }
    public static void displayObjectClass(Object o){
        if(o instanceof Vector){
            System.err.println("Obj was instance of the vector");
        }
        else if(o instanceof ArrayList){
            System.out.println("Obj was instance of ArrayList");
        }
        else{
            System.out.println(o.getClass());
        }
    }
}
