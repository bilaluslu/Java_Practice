package day41_Inheritance.Task01;
/*
create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequirements, gathering
     		create a constructor that can initialize all the attributes of businessAnalyst
 */
public class BusinessAnalyst extends Employee {
    // salary, name, id, jobTitle, gender all of them INHERITED
    // writingReq() , gathering()

    BusinessAnalyst(double salary, String name, long id, char gender) {
        this.salary = salary;
        this.name = name;
        this.id = id;
        jobTitle = "Business Analyst";
        this.gender = gender;
    }

    public void writingReq(){
        System.out.println( name + " is writing requirement");
    }
    public void gathering(){
        System.out.println( name + " is gathering");
    }
}
