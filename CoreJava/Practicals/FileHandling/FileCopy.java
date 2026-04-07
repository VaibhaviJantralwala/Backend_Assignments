package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        String source = "FileHandling/source.txt";
        String destination = "FileHandling/destination.txt";

        // Step 1 — Create source file with some content
        try (FileOutputStream fos = new FileOutputStream(source)) {
            String content = "Hello Vaibhavi!\nThis is source file.\nJava File Copy Program!";
            fos.write(content.getBytes());
            System.out.println("Source file created!");
        } catch (IOException e) {
            System.out.println("Error creating source: " + e.getMessage());
        }

        // Step 2 — Copy source to destination
        try (
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }

        // Step 3 — Read and verify destination file
        try (FileInputStream fis = new FileInputStream(destination)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            System.out.println("\n--- Destination File Content ---");
            while ((bytesRead = fis.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }

        } catch (IOException e) {
            System.out.println("Error reading destination: " + e.getMessage());
        }
    }
}