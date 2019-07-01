package Questions1and2;

public class Main {
    public static void main(String[] args) {

        Salesforce.question1CheckLogin("https://login.salesforce.com");
        Salesforce.question2CheckForgotPassword("https://login.salesforce.com");
        Salesforce.checkRunBoth("https://login.salesforce.com");
    }
}
