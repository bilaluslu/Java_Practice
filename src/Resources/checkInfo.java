package Resources;

import day39_AccessModifiers.PersonalInfo;

public class checkInfo {
    public static void main(String[] args) {

        System.out.println( PersonalInfo.name );
        System.out.println( PersonalInfo.gender );

        //System.out.println( PersonalInfo.grade );   //default is same PACKAGE only
        //System.out.println( PersonalInfo.age );     //default is same PACKAGE only

        //System.out.println( PersonalInfo.SSN );     // private is same CLASS only
        //System.out.println( PersonalInfo.ID  );     // private is same CLASS only


        PersonalInfo obj = new PersonalInfo();
        System.out.println(  obj.name    );
        System.out.println(  obj.gender  );

        //System.out.println(  obj.grade   );   //default is same PACKAGE only
        //System.out.println(  obj.age     );   //default is same PACKAGE only

        //System.out.println(  obj.SSN     );   // private is same CLASS only
        //System.out.println(  obj.ID      );   // private is same CLASS only

    }

}
