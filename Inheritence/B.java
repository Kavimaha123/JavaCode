package Inheritence;

public class B extends A {
    // Constructor calling parent's constructor
    

    public static void main(String[] args) {
        // Create an instance of class B
        B childObj = new B();
        childObj.setUserName("user13");
        childObj.setPassword("password1");

        // Test validation
        //String inputUserName = "user123";
        //String inputPassword = "password123";

        boolean isValid = childObj.validate("user123", "password123");
        if (isValid) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
