/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileiomanager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Peter Zarafield
 */
public class PlainTextFileWriter implements TextFileWriter{
    
    
    Scanner scanner = new Scanner(System.in);

    //private IMonitorOutput o;
    
    private boolean append = false;
    
    private File data;

    public PlainTextFileWriter() {
    }

    @Override
    public void writeFileByLine(File file, List<String> s) throws IOException {
        this.data = data;
        boolean append = true;
        
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data, append)));
        
        for (String line: s){
            out.print(s);
        }
            
    }

    @Override
    public void writeFileByChar(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
