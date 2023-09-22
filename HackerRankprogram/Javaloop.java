package HackerRankprogram;

import java.util.Scanner;

public class Javaloop {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        
        int t=scanner.nextInt();
        for(int i=0;i<t;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            if((c>=1 && c<=15)&&(a>=0&&a<=50)&&(b>=0&&b<=50)){
                int j=0;
                while(j<c){
                    int s=(int) Math.pow(2,j)*b;
                    sum+=a;
                    int ss=sum+a;
                    System.out.println(ss);
                }

            }
            System.out.println("");
        }
        scanner.close();
    }
    
}
