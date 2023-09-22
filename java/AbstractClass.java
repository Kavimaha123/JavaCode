abstract class Animal{
    public void Sound(){
        System.out.println("zzzz");
    }
}
class Scanner extends Animal{
    public void Animal(){
        System.out.println("Lion");
    }

}
public class AbstractClass{
    public static void main(String args[]){
        Scanner scanner=new Scanner();
        scanner.Animal();
        scanner.Sound();
    } 

}