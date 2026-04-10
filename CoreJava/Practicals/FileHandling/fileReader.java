package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        
        try{
            FileWriter fw = new FileWriter("FileHandling/demo.txt");
            fw.write('V');
            fw.write("Java");
            fw.write("ABC");
            fw.close();
        }catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        try{
            FileReader fr = new FileReader("FileHandling/demo.txt");
        int i = fr.read();
        while( i != -1){
            System.out.print((char)i);
            i = fr.read();
        }
        fr.close();
        }catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
        
    }
}
