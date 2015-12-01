/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileiomanager;

import java.io.File;

/**
 *
 * @author Peter Zarafield
 */
public class PlainTextFileWriter implements TextFileWriter{

    public PlainTextFileWriter() {
    }

    @Override
    public void writeFileByLine(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void writeFileByChar(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
