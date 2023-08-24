class Person{
    private String name;
    private int age;
    private String city;

    public String getName(){
        return name;
    }
    public void setNamne(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String string){
        this.age=string;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    } 
}


public class Encapsulation {
    public static void main(String args[]){
        Person person=new Person();
        person.setName("Mahadhevan");
        person.setAge(21);
        person.setCity("Madurai");

        String name=person.getName();
        int age=person.getAge();
        String city=person.getCity();

        System.out.println(name);
        System.out.println(age);
        System.out.println(city);

    }

    
}
