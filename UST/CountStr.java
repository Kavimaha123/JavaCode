package UST;
import java.util.Scanner;

public class CountStr {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.nextLine();
        s=s.toLowerCase(null);
        for(char ch='a';ch<='z';ch++){
            int c=0;
            for(int i=0;i<s.length();i++){
                if(ch==s.charAt(i)){
                    c++;
                }
                System.out.println(ch+""+c);
            }

        }

    }
    
}
