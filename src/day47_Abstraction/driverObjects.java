package day47_Abstraction;

public class driverObjects {
    public static void main(String[] args) {

        ChromeDriver driver1 = new ChromeDriver();
        String URL1 = "http://www.facebook.com";

        driver1.get( URL1 );
        driver1.quit();

        System.out.println("========================================================");

        FirefoxDriver driver2 = new FirefoxDriver();
        String URL2 = "http://www.google.com";

        driver2.get(  URL2  );
        driver2.quit();

        System.out.println("========================================================");

        SafariDriver driver3 = new SafariDriver();
        String URL3 = "http://www.cybertek.com";

        driver3.get(  URL3  );
        driver3.quit();

        System.out.println("========================================================");

        OperaDriver driver4 = new OperaDriver();
        String URL4 = "http://www.google.com";

        driver4.get(  URL4  );
        driver4.quit();
    }
}
