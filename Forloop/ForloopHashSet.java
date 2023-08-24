package Forloop;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ForloopHashSet{
    public static void main(String args[]){
    HashSet<String> set=new HashSet<>();
    set.add("Mahadhevan");
    set.add("Kavi");
    set.add("Vijay");
    set.add("Ajay");
    set.add("Ajay");
//     TreeSet<String> treeSet = new TreeSet<String>(set);
//     for(String ts :treeSet){
//          System.out.println(ts);
//     }
    
    
    Iterator<String> iterator=set.iterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
    }

    }

