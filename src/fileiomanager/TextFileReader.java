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
 *
 * @author Peter Zarafield
 */
public class TextFileReader implements FileReadStrategy{
    private File data;

    public TextFileReader() {
    }

    @Override
    public List<String> readFileByLine(File file) {
        // creates the List<String> to hold the file contents
        List<String> fileContents = new ArrayList<>();

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
