package day33_Custom_Class;

public class capital_One {
    public static void main(String[] args) {

        BankAccount Bilal = new BankAccount();
        Bilal.accountHolder = "Bilal";
        Bilal.accountNumber = 123456;

        Bilal.checkingBalance();
        Bilal.deposit(33);
        Bilal.checkingBalance();

        Bilal.withDraw(13);
        Bilal.checkingBalance();
        
        System.out.println("================================");

        System.out.println( Bilal );





    }
}
