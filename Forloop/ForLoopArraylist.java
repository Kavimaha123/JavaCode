package Forloop;

import java.util.ArrayList;
import java.util.List;



public class ForLoopArraylist {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList();
        a.add(1); // 1+4 =5
        a.add(2); // 2+3 =5
        a.add(3); // 3+2 =5
        a.add(4); // 4+1 =5
        List<Integer> b=new ArrayList();
        b.add(4);
        b.add(3);
        b.add(2);
        b.add(1);
        // for (Integer val : a) {  //val=1  2

            for (int i =0,j=0; i <a.size(); i++,j++) {  //i=0 1  j=0  1 
                System.out.println(a.get(i)+b.get(j));  //1+ 4=5

        // }

    }

}
}

