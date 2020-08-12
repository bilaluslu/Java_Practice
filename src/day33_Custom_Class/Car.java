package day33_Custom_Class;

public class Car {

    String Brand;
    String model;
    int year;
    String color;

    public void start() {
        System.out.println( Brand + " is started" );
    }
    public void drive() {
        System.out.println( "Driving " + Brand + " " + model );
    }
    public void getCarInfo() {
        System.out.println( year + " " + Brand + " " + model + " " + color );
    }
    public void setCarInfo (String carBrand, String carModel, int carYear, String carColor){
        Brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
    }
    public String toString() {
        String result = Brand + " " + year + " " + model + " " + color;
        return result;
    }




    public static void main(String[] args) {

        int a = 100;    // a is local variable ==> variables that are declared within a block

    }


}
