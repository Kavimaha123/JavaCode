package Forloop;

import java.util.Iterator;

public class Forloop{
    public static void main(String[] args) {
        int arr[]={34,56,98,67};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
        System.out.println();
            
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    
    }
}