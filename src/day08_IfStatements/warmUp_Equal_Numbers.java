package day08_IfStatements;

public class warmUp_Equal_Numbers {
    public static void main(String[] args) {

        /* declare 3 numbers n1, n2, n3
        if n1 and n2 are equal  => n1&n2 are equal
        if n2 and n3 are equal ==> n2&n3 are equal
        if n3 and n1 are qual ==>n3&n1 are equal
        if all equal ==> all equal
        if none of them are euqal ==> none of them are equal        */


        double n1 = 10.5;
        double n2 = 20.5;
        double n3 = 20.5;

        boolean n1Equaln2 = n1 == n2 && n1 != n3;
        boolean n1Equaln3 = n1 == n3 && n1 != n2;
        boolean n2Equaln3 = n2 == n3 && n2 != n1;

        boolean allEqual = n1 == n3 && n1 == n2;    //all of them equal

        boolean noneOfThemEqual = n1 != n2 && n1 != n3 && n2!=n3;   //none of them equal

        if (n1Equaln2) {
            System.out.println(n1 + " is equal to " + n2);
        }
        if (n1Equaln3) {
            System.out.println(n1 + " is equal to " + n3);
        }
        if (n2Equaln3) {
            System.out.println(n2 + " is equal to " + n3);
        }
        if (allEqual) {
            System.out.println("n1 is equal to n2 and n3");
        }
        if (noneOfThemEqual) {
            System.out.println("None of them are equal");
        }












    }
}
