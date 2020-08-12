package day34_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {

        Testers tester1 = new Testers();
        tester1.setTesterInfo("Madina", 1112233445,"QA", 200000.00);

        Testers tester2 = new Testers();
        tester2.setTesterInfo("Venera",234567834,"Senior SDET",150000);

        Testers tester3 = new Testers();
        tester3.setTesterInfo("Sha Rejepov",6235487,"SDET",120000);

        Testers tester4 = new Testers();
        tester4.setTesterInfo("Muhtar",111,"Manuel Tester",120000);

        Testers tester5 = new Testers();
        tester5.setTesterInfo("Sha Rejepov",222222,"Uber Driver",60000);

        ArrayList<Testers> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1, tester2, tester3, tester4, tester5) );

        testers.removeIf( p -> !p.jobTitle.contains("SDET") );

        double totalBudget = 0;
        for( Testers each :  testers){
            System.out.println(each);
            totalBudget += each.salary;
        }

        System.out.println(totalBudget);






    }
}
