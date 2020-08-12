package day47_Abstraction;

public class SafariDriver extends RemoteWebDriver{

    @Override
    public void get(String URL) {
        System.out.println("Opening " + URL + " in safari browsing");
    }

    @Override
    public void quit() {
        System.out.println("Closing the safari browser");
    }
}
