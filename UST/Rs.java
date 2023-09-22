package UST;

public class Rs {
    
    public static void main(String args[]){
        String str="Geeks For Geeks";
        int index=6;
        char ch='M';
        str=str.substring(0,index)+ch+str.substring(index+1);
        System.out.println(str);

    }
}
