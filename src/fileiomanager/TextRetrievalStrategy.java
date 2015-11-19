/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileiomanager;

/**
 *
 * @author Peter Zarafield
 */
public interface TextRetrievalStrategy {
    
    public abstract String getLineOfText();
    public abstract char getCharacterOfText();
    
}
