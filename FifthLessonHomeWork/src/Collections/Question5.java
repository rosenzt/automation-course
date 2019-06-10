package Collections;

// Java program to read and download
// webpage in html file

import java.io.*;
import java.net.URL;
import java.net.MalformedURLException;

/**
 * 1. Create a URL object and pass url as string to download the webpage.
 * URL example = new URL(pass url of webpage you want to download)
 * 2. Create Buffered Reader object and pass openStream(). Method of URL in Input Stream object.
 * 3. Create a string object to read each line one by one from stream.
 * 4. Write each line in html file where webpage will be downloaded.
 * 5. Close all objects.
 * 6. Catch exceptions if url failed to download.
 */

public class Question5 {

    public static void main(String args[]) throws IOException {
        String url = "https://www.geeksforgeeks.org/";
        downloadWebPage(url);
    }

    public static void downloadWebPage(String webpage) {
        try {

            // Create URL object
            URL url = new URL(webpage);
            BufferedReader readr =
                    new BufferedReader(new InputStreamReader(url.openStream()));

            // Enter filename in which you want to download
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("Question5.html"));

            // read each line from stream till end
            String line;
            while ((line = readr.readLine()) != null) {
                writer.write(line);
            }

            readr.close();
            writer.close();
            System.out.println("Successfully Downloaded.");
        }

        // Exceptions
        catch (MalformedURLException mue) {
            System.out.println("Malformed URL Exception raised");
        } catch (IOException ie) {
            System.out.println("IOException raised");
        }
    } //downloadWebPage

}
