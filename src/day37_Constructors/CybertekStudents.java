package day37_Constructors;

public class CybertekStudents {

    static String schoolName = "Cybertek University";
    String studentName; // we must need to know
    int groupNumber; // we must need to know
    String batch; // we must need to know

    public CybertekStudents( String studentName, int groupNumber, String batch ){
        //schoolName = "Cybertek School"; // if we initialize here it will change only student1
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }
    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+", in group: "+groupNumber+", School Name is: "+schoolName;
    }
}

class Objects {
    public static void main(String[] args) {
        CybertekStudents student1 = new CybertekStudents("Ali",3,"18");
        System.out.println(student1);

        CybertekStudents student2 = new CybertekStudents("Sarah",12,"18");
        System.out.println(student2);
    }
}
