/*
 java data from url
 */
import java.net.*;
import java.io.*;

public class urll {
    public static void main(String[] args) throws Exception {
        
        URL oracle = new URL("https://drive.google.com/drive/u/0/folders/11L0DmW_KrAX6JaRBQDH4kMcspK8tx_ne");
        BufferedReader in = new BufferedReader(
                                               new InputStreamReader(oracle.openStream()));
        
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
