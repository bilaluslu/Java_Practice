package day39_AccessModifiers;

public class CarObjects {
    public static void main(String[] args) {
        // new Constructor
        Car car1 = new Car("Toyota");
        System.out.println(car1);

        Car car2 = new Car("BMW","X6");
        System.out.println(car2);

        Car car3 = new Car("Mercedes","S550",2020);
        System.out.println(car3);

        Car car4 = new Car("Kia","Forte",2017,17000.0);
        System.out.println(car4);


    }

}
