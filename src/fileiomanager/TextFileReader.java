/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileiomanager;

import java.io.File;
import java.util.List;

/**
 *
 * @author Peter Zarafield
 */
public interface TextFileReader {
    
    //public abstract String[] readFileByLine(File file);
    public abstract List<String> readFileByLine(File file);
    
    //public abstract String[] readFileByChar(File file);
    public abstract List<String> readFileByChar(File file);
}
