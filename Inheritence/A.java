package Inheritence;

public class A {
    
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Method to validate username and password
    boolean validate(String userName, String password) {
        return this.userName.equals(userName) && this.password.equals(password);
    }
}