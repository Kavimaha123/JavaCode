package JavaBinary;

import java.util.Scanner;

public class Number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int sum1=0;

        for(int i=0;i<n;i++){
            if(n%4==0){
                sum+=n;
                System.out.println(sum);
            }
            else{
                sum1+=n;
            }

        }
        System.out.println(sum1-sum);
    }
    
}
