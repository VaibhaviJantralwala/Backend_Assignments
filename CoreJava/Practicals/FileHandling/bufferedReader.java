package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class bufferedReader {
    public static void main(String[] args) throws IOException {
        
        try (PrintWriter pw = new PrintWriter("FileHandling/demo1.txt")) {
            pw.println("Hello Vaibhavi!");
            pw.println("This is BufferedReader demo.");
            pw.println("Java File Handling!");
        }
        
        try (BufferedReader br = new BufferedReader(
                new FileReader("FileHandling/demo1.txt"))) {

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
    }
}

// output :
// $ java -cp . FileHandling.bufferedReader
// Hello Vaibhavi!
// This is BufferedReader demo.
// Java File Handling!

