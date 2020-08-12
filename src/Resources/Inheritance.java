package Resources;
/*
    public: accessible at everywhere, visible to the world
    protected: visible in same package, visible in sub class outside package
                protected is always visible to any sub-class
    default: only visible in same package
    private: only visible within the same class
 */
import day42_Inheritance.Data;

public class Inheritance extends Data {
    //           sub             super

    public static void main(String[] args) {

        System.out.println( Inheritance.publicData );
        System.out.println( Inheritance.protectedData );
        //System.out.println( Inheritance.defaultData ); // default: only visible in same package
        //System.out.println( Inheritance.privateData );  //private: only visible within the same class

    }
}
