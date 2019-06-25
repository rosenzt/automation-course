package Question5;

public class Main {
    public static void main(String[] args) {

        System.out.println("Visit page method response is: " + SeleniumOrg.visitPage("https://www.seleniumhq.org/"));
        System.out.println("Selenium site validation response is: " + SeleniumOrg.isItSeleniumSite());
        System.out.println("The text validation response is: " + SeleniumOrg.isTextExist("Selenium WebDriver"));

    }
}
