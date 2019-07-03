package Actions.Question6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        FlightConnections flightconnections = new FlightConnections(driver);
        flightconnections.flight(driver,"TLV", "Vienna");
    }
}
