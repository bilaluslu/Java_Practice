package day50_Polymorphism;

public class Encapsulation {
    // Encapsulation: hiding the data by using private, use the public getter/setter to read and modify the private data
    // getter and setter is instance method
    //  getter( read only ) : returns the private data
    //  setter ( write only) : assigning the argument to private variable
    // IF PRIVATE DATA IS FINAL, WE CAN ONLY GENERATE GETTER


    private String username = "MIT";

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

}

class Test{
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        // obj.username; // we cannot call username due to private access modifier
        System.out.println(  obj.getUsername() );

        //obj.username = "Cybertek"; // we cannot assign this way
        obj.setUsername("Cybertek");

        System.out.println( obj.getUsername() );

    }
}
