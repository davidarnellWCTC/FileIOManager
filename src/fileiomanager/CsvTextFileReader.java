/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileiomanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *This class reads lines from CSV files and adds them to a List of Strings
 * each line has the commas replaced with spaces.
 * @author Peter Zarafield
 */
public class CsvTextFileReader implements TextFileReader {

    public CsvTextFileReader() {
    }

    @Override
    public List<String> readFileByLine(File file) {

        // creates the List<String> to hold the file contents
        List<String> fileContents = new ArrayList<>();

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String csvLine = in.readLine();
            while (csvLine != null) {

                String line = csvLine.replace(",", " ");

                fileContents.add(line);
                line = in.readLine();
            }
        } catch (IOException ioe) {
            System.out.println("Problem reading the file: " + file.getName());
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
        return fileContents;
    }

    @Override
    public List<String> readFileByChar(File file) {
        // creates the List<String> to hold the file contents
        List<String> fileContents = new ArrayList<>();

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));

            char csvChar = (char) in.read();
            while (csvChar != -1) {

                fileContents.add("" + csvChar);
                csvChar = (char) in.read();
            }

        } catch (IOException ioe) {
            System.out.println("Problem reading the file: " + file.getName());
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
        return fileContents;
    }

}
