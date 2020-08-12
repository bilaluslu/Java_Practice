package day41_Inheritance.Task02;

public class AccountObjects {
    public static void main(String[] args) {

        CheckingAccount obj = new CheckingAccount();
        obj.accountHolder = "Saban";
        obj.accountNumber = 12345678;

        System.out.println(  obj  );
        obj.showBalance();
        obj.deposit(25000);
        obj.showBalance();

        obj.withdraw(2000);
        obj.showBalance();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        SavingAccount saving = new SavingAccount();

        System.out.println( SavingAccount.interestRate );

        saving.accountHolder = "Bilal";

        System.out.println( saving );
        saving.showBalance();

        saving.deposit(12000);
        saving.showBalance();



    }
}
