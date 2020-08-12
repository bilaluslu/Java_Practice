package day09_Nested_If_Ternary;

public class age_Groups_Nested_If_Practice {
    public static void main(String[] args) {

        /* write a program that can define the age group of a person
            age groups:
            teenager <21
            adult >= 21 && < 55
            senior >= 55
            age cannot be negative or greater than 150
         */


        int age = 25;
        String ageGroup = "";

        if (age < 150 && age > 0) {

            if (age < 21) {
                ageGroup = "Teenager";
            } else if (age < 55) {
                ageGroup = "Adult";
            } else {
                ageGroup = "Senior";
            }

        } else {
            ageGroup = "Invalid Entry";
        }
        System.out.println("=======\n" + ageGroup + "\n=======");















    }
}
