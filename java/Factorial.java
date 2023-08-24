// import java.util.Scanner;

// public class Factorial {
    
//     public static int Factorial1(int n){
//         int res=1;
//         for(int i=2;i<=n;i++){
//             res+=i;
//         }
//         return res;
//     }

// public static void main(String args[]){
//     // Scanner scanner=new Scanner(System.in);
//     // int num=scanner.nextInt();
//     int num=5;
//     System.out.println(Factorial1(5));

// }
// } 

public class Factorial{
    public static void main(String args[]){ 
        for(int i=0;i<=10;i++){
            System.out.println(fact(i));
        } 
    }
    public static long fact(long num){
        if(num <=1){
            return 1;
        }
        else{
            return num*fact(num-1);
        }
    }
}