package day47_Abstraction;

public class ChromeDriver extends RemoteWebDriver {
    @Override
    public void get(String URL){
        System.out.println("Opening " + URL + " in chrome browsing");
    }

    @Override
    public void quit(){
        System.out.println("Closing the chrome browser");
    }


}
