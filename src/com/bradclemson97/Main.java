package com.bradclemson97;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String[] names = {"John", "Carl", "Jerry"};

        //Writing text to an output file...
        //This code can throw an IO exception so we need to surround our code with a try-catch block
        //Every time we run, it overrides any existing output.txt file in the output path
        try {
            //Note when specifying an absolute path to write our output file to we need to us double '\\' backslash
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\bclemson\\Downloads\\output.txt"));
            writer.write("Writing to a file.");
            //'\n' puts in a new line
            writer.write("\nHere is another line.");

            for (String name : names) {
                writer.write("\n" + name);
            }
            //After writing everything to the file we must...
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Reading text from an input file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            //below reads line from our input file and puts that text into our line variable until our line reads null (reads all lines)
            while((line = reader.readLine()) != null)
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
