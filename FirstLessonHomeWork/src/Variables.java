
public class Variables {
    public static void main(String[] args) {
        String myName="John Doe";
        String myAddress="Somewhere 123";
        int myAge=25;
        double myHeight=185;
        long mySalary=15000;

        Variables.printVariables(myName,myAddress,myAge,myHeight,mySalary);

        myName="John Smith";
        myAddress="Somewhere 234";
        myAge=34;
        myHeight=190;
        mySalary=20000;

        Variables.printVariables(myName,myAddress,myAge,myHeight,mySalary);

    }

    private static void printVariables(String myName, String myAddress, int myAge, double myHeight, long mySalary) {
        System.out.println("My name is " + myName + ",\nI leave at " + myAddress +
                ",\nI am " + myAge +"years old,\nMy height is " + myHeight + " cm,\nI earn " + mySalary + "$ a month.");
    }
}//Class
