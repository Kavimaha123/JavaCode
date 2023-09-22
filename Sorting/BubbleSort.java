package Sorting;

public class BubbleSort {
    static void sort(int arr[]){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        }
    

    public static void main(String args[]){
        BubbleSort bubbleSort=new BubbleSort();
        int arr[]={23,4,15,2,10};
        BubbleSort.sort(arr);
        System.out.println("Sorted array");
        //BubbleSort.printArray(arr);
    }
    
}

