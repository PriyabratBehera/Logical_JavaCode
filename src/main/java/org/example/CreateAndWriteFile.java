package org.example;

import java.io.File;
import java.io.FileWriter;

public class CreateAndWriteFile {
    public static void main(String[] args) {
        // Create a File
        File file = new File("JavaFile.java");

        try {

            // create a new file with name specified
            // by the file object
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("New Java File is created.");
            }
            else {
                System.out.println("The file already exists.");
            }
        }
        catch(Exception e) {
            e.getStackTrace();
        }

        // Write Content to the File
        String program = "class JavaFile { " +
                "public static void main(String[] args) { " +
                "System.out.println(\"This is file\");"+
                "}"+
                "}";
        try {
            // Creates a Writer using FileWriter
            FileWriter output = new FileWriter("JavaFile.java");

            // Writes the program to file
            output.write(program);
            System.out.println("Data is written to the file.");

            // Closes the writer
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
