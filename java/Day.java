import java.util.Scanner;
public class Day {
    
    public static void main(String args[]){
        Scanner ins=new Scanner(System.in);
        int n=ins.nextInt();
        // int day=n;
        // System.out.println(day);
        switch(n){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Tuesday");
            case 3:
            System.out.println("wednesday");
            case 4:
            System.out.println("thursday");
            case 5:
            System.out.println("friday");
            case 6:
            System.out.println("saturday");
            default:
            System.out.println("Date is not avilable");
        }
    }
}
