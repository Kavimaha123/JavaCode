public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static void main(String args[]){
        Person person1=new Person("Maha",20);
        Person person2=new Person("Ajay",18);
        System.out.println(person1.getName() + person1.getAge());
        
    }
    
}
