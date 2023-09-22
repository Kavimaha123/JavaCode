import java.util.Arrays;

public class IndexValue {
    public static void main(String args[]){
        int a[]={10,23,30,40,50,60,70};
        System.out.println("BeforSporting:"+a);
        int index=2;
        int value=33;

        for(int i=a.length-1;i>2;i--)
        {            
            a[i]=a[i=1];
        }
        a[index]=value;
        System.out.println(Arrays.toString(a));
    }
}
