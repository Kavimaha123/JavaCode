public class ClassAndObject {
     public int add(int a,int b){
        return a+b;
     }
     
    
    public static void main(String args[]){
        ClassAndObject cal=new ClassAndObject();
        int c=cal.add(2,3);
        System.out.println(c);
    }
    
}
