package day49_Polymorphism;

public final class iPhone extends Phone implements AppleApps {  // we put final so it cannot be parent of any class

    static {
        brand = "Apple";
    }

    public iPhone(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void download() {
        System.out.println("iPhone is downloading apps from Apple Store");
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting to " + phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling to " + phoneNumber);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is facetiming to " + phoneNumber);
    }

    public void selfie(){
        System.out.println(model+ " takes a great selfie");
    }

}
