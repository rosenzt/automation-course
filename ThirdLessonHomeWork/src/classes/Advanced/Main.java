package classes.Advanced;

import java.io.*;

public class Main {
    public static void main(String args[]) {
        try {
            FileInputStream fstream = new FileInputStream("ThirdLessonHomeWork/src/classes/Advanced/textfile.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            while ((strLine = br.readLine()) != null) {
                if (strLine.contains("Tal"))
                    System.out.println(strLine);
            }
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
