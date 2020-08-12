package day49_Polymorphism;

public class PhoneObject {
    public static void main(String[] args) {

        iPhone phone1 = new iPhone("8 Plus",849.99,"4.7 inch");
        System.out.println(phone1);
        phone1.calling(911);
        phone1.texting(12345678);
        phone1.selfie();
        phone1.faceTiming(87654321);
        phone1.download();

    }
}
