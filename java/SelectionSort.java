public class SelectionSort {
    void sort(int arr[]){
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            int m=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[m]){
                    m=j;

                    int temp=arr[m];
                    arr[m]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
            System.out.println();
        }
    }
    public static void main(String args[]){
        SelectionSort selectionSort=new SelectionSort();
        int arr[]={54,33,23,1,7};
        selectionSort.sort(arr);
        System.out.println("Sorted array");
        selectionSort.printArray(arr);

    }
}
