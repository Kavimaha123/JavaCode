public class Array{
    public static boolean array(int arr[],int key){
        for(int element : arr){
            if(element == key){
                return true;
            }
        }
        return false;
    }

public static void main(String []args){
    int arr[]={2,3,5,6,7,8,9};
    int key=11;
    System.out.println(array(arr, key));
}
}