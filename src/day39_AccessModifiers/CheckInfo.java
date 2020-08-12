package day39_AccessModifiers;

public class CheckInfo {
    public static void main(String[] args) {

        System.out.println( "Name :"+PersonalInfo.name );
        System.out.println( "Gender: "+PersonalInfo.gender );

        System.out.println(   "Grade: "+PersonalInfo.grade  );
        System.out.println(   "Age: "+PersonalInfo.age  );

        //System.out.println(   "SSN: "+PersonalInfo.SSN  );  // returns error because it is private
        //System.out.println(   "ID: "+PersonalInfo.ID  );  // returns error because it is private

        PersonalInfo obj = new PersonalInfo();
        System.out.println(  obj.name    );
        System.out.println(  obj.gender  );

        System.out.println(  obj.grade   );
        System.out.println(  obj.age     );

        //System.out.println(  obj.SSN     );   // private is same CLASS only
        //System.out.println(  obj.ID      );   // private is same CLASS only



    }
}
