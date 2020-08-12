package day34_Custom_Class;

public class CapitalOne {
    public static void main(String[] args) {


        Testers tester1 = new Testers();
        tester1.setTesterInfo("Muhtar", 123, "Manual Tester", 70000);

        ScrumTeam scrum = new ScrumTeam();
        scrum.hireTester(tester1);

        System.out.println(scrum.testersTeam.size());

        scrum.fireTester(123);
        System.out.println(scrum.testersTeam.size());

    }
}