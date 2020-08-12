package day42_Inheritance.Task01;
/*
        create a subclass of Person called Student
        attributes: name, age, gender, studentID, clazz
        methods: attendClass, code, setStudentInfo, toString
        schoolName = "Cybertek School"
 */
public class Student extends Person{

    public long studentID;
    public String clazz;
    public static String schoolName = "Cybertek School";

    public void setStudentInfo(String name,int age,char gender,long studentID, String clazz){
        setPersonInfo(name, age, gender);
        this.studentID = studentID;
        this.clazz = clazz;
    }
    public void attendClass(){
        System.out.println( name + " is attending class");
    }
    public void code(){
        System.out.println( name + " is coding");
    }



    public String toString(){
        return "Name: "+name+", ID: "+studentID+", Class: "+clazz
                +", age: "+age+", gender: "+gender+" School: "+schoolName;
    }
}
