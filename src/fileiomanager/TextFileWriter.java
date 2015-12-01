/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileiomanager;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Peter Zarafield
 */
public interface TextFileWriter {
    
    public abstract void writeFileByLine(File file, List<String> s) throws IOException;
    
    public abstract void writeFileByChar(File file, char c) throws IOException;
    
}
