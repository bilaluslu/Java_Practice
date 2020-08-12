package homePractice;
//Encapsulation:
//Encapsulation is one of the fundamental concepts in object-oriented
// programming (OOP).
//The main concept is hiding data. we have 4 access modifier:
// public, protected, default, private
//we will explore in 4 different categories.
//*within same class
//*within same package
//*sub-classes outside package
//*rest of the place
public class denememe1 {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables 
        obj.setSSN(19);

        // Displaying values of the variables
        System.out.println("age is : " + obj.getSSN());

        }
    }

