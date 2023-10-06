package QuickSort;

import java.util.Arrays;

public class QuickSort {
    private int temp_array[];
    private int len;
    public void sort(int[] num){
        if(num==null || num.length==0){
            return;
        }
        this.temp_array=num;
        len=num.length;
        quicksort(0,len-1);
    }
    private void quicksort(int lowindex, int highindex){
        int i=lowindex;
        int j=highindex;
        int pivot=temp_array[lowindex+(highindex-lowindex)/2];
        while(i<=j){
            while(temp_array[i]<pivot){
                i++;
            }
            while(temp_array[j]>pivot){
                j--;
            }
            if(i<=j){
                exchangeNumber(i,j);
                i++;
                j--;
            }
        }
        if(lowindex<j){
            quicksort(lowindex,j);
        }
        if(i<highindex){
            quicksort(highindex,i);
        }
        private void exchangeNumber(int i,int j)
{
    int temp=temp_array[i];
    temp_array[i]=temp_array[j];
    temp_array[j]=temp;
    
}

    }
    public static void main(String args[]){
        QuickSort qs=new QuickSort();
        int num[]={-2,-7,0,22,34,12};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(num));
        qs.sort(num);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(num));
        
    }
    
}
