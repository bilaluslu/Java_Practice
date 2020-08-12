package day49_Polymorphism;
/*
 1. create an interface named downloadable:
            variable: boolean downloadable
            abstract method: download();
    1. create an interface named AndroidApps that can inherit from downloadable interface
            variable: AppStoreName

    2. create an interface named AppleApps that can inherit from downloadable interface
            variable: AppStoreName
    3. create an abstract class named Phone
            variables: brand, model, price, size
            abstract methods: texting(), calling()
    4. create a class named iPhone that can inherit from AppleApps interface
            actions that every iphone can do: texting(), calling(), faceTiming(), selfie()
    5. create a class named Nokia that can inherit from AndroidApps interface
            actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()
    in each sub classes of phone, create a constructor to initialize the instances
 */
interface downloadable {
    boolean downloadable = true;    // public static final
    void download();    // public abstract
}

interface AndroidApps extends downloadable {    // 2 variables , 1 abstract method
    String AppStoreName = "Android";    // public static final

}

interface AppleApps extends downloadable {    // 2 variables , 1 abstract method
    String AppStoreName = "Apple";    // public static final

}


public abstract class Phone {   // 2 abstract method
    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void texting (long phoneNumber );
    public abstract void calling (long phoneNumber );

    public String toString() {
        return "Brand = " + brand + ", Model = " + model + ", Price = " + price + ", Size = " + size;
    }

}
