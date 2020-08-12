package day08_IfStatements;

public class Multi_Branch_If_Practice_02 {
    public static void main(String[] args) {

        double n1 = 20.5;
        double n2 = 23.5;
        double n3 = 21.5;

        boolean n1Equaln2 = n1 == n2 && n1 != n3;
        boolean n1Equaln3 = n1 == n3 && n1 != n2;
        boolean n2Equaln3 = n2 == n3 && n2 != n1;
        boolean allEqual = n1 == n3 && n1 == n2;    //all of them equal

        String result = " ";

        if (n1Equaln2){
            //System.out.println("n1 equal to n2");
            result = "n1 equal to n2" ;
        }
        else if (n1Equaln3) {
            //System.out.println("n1 equal to n3");
            result = "n1 equal to n3" ;
        }
        else if (n2Equaln3) {
            //System.out.println("n2 equal to n3");
            result = "n2 equal to n3" ;
        }
        else if (allEqual) {
            //System.out.println("all of them equal");
            result = "all of them equal" ;
        }
        else {
            //System.out.println("None of them equal");
            result = "None of them equal" ;
        }

        System.out.println(result);

        boolean results = 1+11+"3" == "123";
        System.out.println(results);









    }
}
