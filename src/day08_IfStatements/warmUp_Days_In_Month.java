package day08_IfStatements;

public class warmUp_Days_In_Month {
    public static void main(String[] args) {

        byte month = 3;

        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;

        boolean days31 = days28 == false && days30 == false;

        if (days28){
            System.out.println("It has 28 days");
        }
        if (days30){
            System.out.println("It has 30 days");
        }
        if (days31){
            System.out.println("It has 31 days");
        }









    }
}
