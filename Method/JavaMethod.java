package Method;

public class JavaMethod {
    public static void Mymethod(){
        System.out.println("Hello ");
    }
    public static void Mypara(String name){
        System.out.println(name +"devan");
    }
    public static int value(int x,int y){
        return x+y;
    }
    public static void main(String args[]){
        Mymethod();
        Mypara("maha");
        System.out.println(value(5,5));
    }
    
}
