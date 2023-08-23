public class Dog {
    private String name;
    private int age;
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
 

public static void main(String args[]){
    Dog dog1=new Dog("Don",5);
    Dog dog2=new Dog("Maxi",6);
    System.out.println(dog1.getName() + dog1.getAge());
    System.out.println(dog2.getName() + dog2.getAge());
    System.out.println();
    dog1.setName("Dom");
    dog1.setAge(7);
    System.out.println(dog1.getName() + dog1.getAge());
}
}
