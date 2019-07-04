package Elements.Question3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Echoecho {
    private WebDriver driver;

    public Echoecho(WebDriver driver) {
        this.driver = driver;
    }

    private void lunchSite(WebDriver driver){
        driver.manage().window().maximize();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
    }

    private void selectRadioButtons(){
        driver.findElement(By.cssSelector(".table8 > [name='radio1']:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".table5 > [name='group1']:nth-child(5)")).click();
        driver.findElement(By.cssSelector(".table5 > [name='group2']:nth-child(11)")).click();
    }

    private void closeBrowser(){
        driver.quit();
    }

    public void testEchoechoRadioButtons(WebDriver driver){
        lunchSite(driver);
        selectRadioButtons();
        closeBrowser();
    }


}
