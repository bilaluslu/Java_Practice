package day41_Inheritance;

import javax.imageio.event.IIOReadProgressListener;

public class BankOfAmerica {
    public static void main(String[] args) {

        BankAccount Irina = new BankAccount("Irina","Li");
        System.out.println(   Irina.getAccountHolder()   );

        System.out.println(   Irina.getBalance()   );

        Irina.checkBalance();

        Irina.depositing(1000);
        Irina.checkBalance();

        Irina.withdrawing(480);
        Irina.checkBalance();

        System.out.println(  Irina  );

    }
}
