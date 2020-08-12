package day37_Constructors;

public class InstanceBlock {

    static {
        System.out.println("static block");
    }
    {
        System.out.println("instance block1111");
    }


    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();

        InstanceBlock obj2 = new InstanceBlock();

        }

    {
        System.out.println("instance block2222");
    }

    }



