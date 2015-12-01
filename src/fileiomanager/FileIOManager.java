
package fileiomanager;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *This project is designed to have methods to read different
 * types of text based files.
 * 
 * The project is meant to be generic enough to be adaptable for different
 * uses for different applications. 
 * 
 * I had originally misunderstood the purpose of this lab and made this project
 * to work for the Mailing List lab and had to change everything around to make 
 * it more generic and usable for other projects. There are still a few changes 
 * I need to make to some classes to get this to work properly.
 * 
 * 
 * @author Peter Zarafield
 */
public class FileIOManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        File data = new File(File.separatorChar + "temp" + File.separatorChar
//                + "AddressBook.txt");
//        
//        // Creating TextFileReader and ConsolePrinter Objects
//        TextFileReader tfr = new TextFileReader(data);
//        TextFileWriter tfw = new TextFileWriter();
//        IMonitorOutput cp = new ConsolePrinter();
//
//        // Creates a List<String> with the whole contents of the file
//        List<String> textFileContents = tfr.wholeFileReader(data);
//
//        // Creates a List<String> with just the names and states in the text file
//        List<String> textFileStates = tfr.getState(data);
//
//        // Lab Problem #1
//        System.out.println("Contents of the file:");
//        cp.printListString(textFileContents);
//        System.out.println();
//
//        // Lab Problem #2
//        System.out.println("Names and states:");
//        cp.printListString(textFileStates);
//        System.out.println();
//
//        // Lab Problem #3
//        System.out.println("Second contact and their state:");
//        cp.printListString(tfr.getSecondAddressBookContact(data));
//        System.out.println();
//        
//        // Lab Problem #2 part 2
//        
//        //TextFileWriter tfw = new TextFileWriter();
//        
//        try {
//           data = tfw.writeContactToFile(cp, data);
//        } catch (IOException ex) {
//        }
//        
//        // Prints the revised addressBook file
//        cp.printListString(tfr.wholeFileReader(data));

        
    }
    
}
