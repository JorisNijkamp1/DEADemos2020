package org.oose.dea;

import java.io.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            new App().readFile();
        } catch (MyExampleException e) {
            e.printStackTrace();
        }
    }

    public void readFile() throws MyExampleException {
        File file = new File("/Users/joris/Desktop/text.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = "";
            while ((s = br.readLine()) != null)
                System.out.println(s);
        } catch (Exception e) {
            throw new MyExampleException("Dikke error");
        } finally {
            System.out.println("Ik kom hier altijd");
        }
    }
}
