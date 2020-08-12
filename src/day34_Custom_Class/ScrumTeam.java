package day34_Custom_Class;

import java.util.ArrayList;

public class ScrumTeam {
    ArrayList<Testers> testersTeam = new ArrayList<>();

    public void hireTester(Testers tester){
        testersTeam.add(tester);
    }

    public void fireTester(long employeeID){
        testersTeam.removeIf( p -> p.employeeID == employeeID);
    }
}
