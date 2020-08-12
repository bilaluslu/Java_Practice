package day46_final_abstract;

public class final_Variables {

    final int InstanceVariable = 10;
    //final int InstanceVariable2;  // final instance variable need to be initialize immediately

    final static int staticVariable = 20; // check line 31

    //final static int staticVariable2;   // final static variable need to be initialize immediately

    public static void main(String[] args) {

        final double PI = 3.14; // after final keyword, variable is constant.
        //PI = 3.21;  // if we give final keyword before primitive variable,
                    // we canNOT initialize again.

        final String gender = "Male";
        //gender = "Female";  // same reason here we declare gender as male so
                            // we can NOT initialize again

        final int score;
        score = 100;
        //score = 200;
        System.out.println(  score  );

        System.out.println("================================");

        //this.InstanceVariable = 40;
        final_Variables obj = new final_Variables();
        //obj.InstanceVariable = 40;

        //staticVariable = 25;


    }

}
