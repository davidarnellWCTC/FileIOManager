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
public interface FileWriteStrategy {
    
    public abstract void writeFileByLine(File file);
    
    public abstract void writeFileByChar(File file);
    
}
