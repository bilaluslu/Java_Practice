package day40_Encapsulation;

public class CredantialsObject {
    public static void main(String[] args) {

        Credantials facebook = new Credantials();

        facebook.setUserName("A.paulara");
        facebook.setPassWord("123456789");

        System.out.println(  facebook.getUserName()  );
        System.out.println(  facebook.getPassWord()  );


    }
}
