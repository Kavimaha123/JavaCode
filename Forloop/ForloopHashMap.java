package Forloop;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ForloopHashMap{
    public static void  sortedKey(){
        TreeMap<Integer,String> treemap=new TreeMap<>();
        for(int i=treemap.size()-1;i<treemap.size();i--){
        for(Map.Entry<Integer,String> entry:treemap.entrySet()){
            System.out.printf(entry.getKey()+entry.getValue());
        }
        }
    }
    public static void main(String args[]){
        HashMap<Integer,String> hashmap=new HashMap<>();
        hashmap.put(1,"Maha");
        hashmap.put(2,"Vijay");
        hashmap.put(3,"Ajay");
        sortedKey(); 


    }
    
}
