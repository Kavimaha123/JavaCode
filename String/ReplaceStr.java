package String;

import java.util.Scanner;

public class ReplaceStr {
    public static void converttoOppsite(){
        String string;
        for(int i=0;i<string.length();i++){
            Character c=string.charAt(i);
            if(Character.isLowerCase(c)){
                string.replace(i, i+1,Character.toUpperCase(c));
            }
            else{
                string.replace(i,i+1,extracted(c));
            }
        }

    }
    private static char extracted(Character c) {
        return Character.toLowerCase(c);
    }
    public static void main(String args[]){
        Scanner str=new Scanner(System.in);
        String string=str.nextLine();
        converttoOppsite();
        System.out.println(string);
    }

      