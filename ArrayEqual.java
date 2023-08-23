import java.util.Array;

public class ArrayEqual{
    public static void main(String args[]){
        int a[]={1,2,3};
        int b[]={1,2,3};
        boolean result=Arrays.equal(a,b);
        if(result==true){
          System.out.println("Two arrays are equal");
        }
        else{
            System.out.println("Not equal");
        }
    }

}