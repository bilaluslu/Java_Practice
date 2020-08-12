package day41_Inheritance.Task01;
/*
create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			create a constructor that can initialize all the attributes of Tester
 */
public class Tester extends Employee {
    // salary, name, id, jobTitle, gender all of them INHERITED
    // reporting() , testing()

    public Tester(String name,double salary, long id, String jobTitle,char gender){
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

    public void reporting(){
        System.out.println( name + " is reporting a bug");
    }
    public void testing(){
        System.out.println( name + " is testing");
    }


}
