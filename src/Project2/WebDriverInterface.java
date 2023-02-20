package Project2;
/*
Provide Implementation for the diagram below. Then create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes
and see which methods available to them.
 */
public interface WebDriverInterface {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriverInterface {
    void navigate();
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
    }
    @Override
    public void close() {
    }
    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void getScreenshot() {
    }
    @Override
    public void navigate() {
    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
    }
    @Override
    public void close() {
    }

    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void getScreenshot() {
    }
    @Override
    public void navigate() {
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
    }
    @Override
    public void close() {
    }
    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void getScreenshot() {
    }
    @Override
    public void navigate() {
    }
}
class WebDriverTester {
    public static void main(String[] args) {
        ChromeDriver chrome=new ChromeDriver();
        System.out.println(chrome.getTitle());
        chrome.navigate();
        chrome.open();
        chrome.close();
        chrome.getScreenshot();

        FirefoxDriver firefox=new FirefoxDriver();
        System.out.println(firefox.getTitle());
        firefox.navigate();
        firefox.open();
        firefox.close();

        SafariDriver safari=new SafariDriver();
        System.out.println(safari.getTitle());
        safari.navigate();
        safari.open();
        safari.close();

    }
}