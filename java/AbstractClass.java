import java.io.InputStream;

abstract class Animal{
    public void Sound(){
        System.out.println("zzzz");
    }
}
class Scanner extends Animal{
    public Scanner() {
    }

    public Scanner(InputStream in) {
    }

    public void Animal(){
        System.out.println("Lion");
    }

    public int nextInt() {
        return 0;
    }

}
public class AbstractClass{
    public static void main(String args[]){
        Scanner scanner=new Scanner();
        scanner.Animal();
        scanner.Sound();
    } 

}