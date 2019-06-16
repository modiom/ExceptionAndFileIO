import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.*;
public class exception {
	public static void main(String[] args) throws SecurityException, IOException {
		Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		
        try {
        	int a[] = {1,2,3}; 
        	a[5] = 99;
        	
        }
        catch(ArrayIndexOutOfBoundsException | SecurityException e){
        	System.out.println("-----------Array Index Out Of Bounds Exception is caught here --------");
        	FileHandler fh1 = new FileHandler("C:\\Users\\om.modi\\Desktop\\Arraylog.txt");
			log.addHandler(fh1);
            log.log(Level.SEVERE, e.getMessage());
        }
          
        try {
        	File file = new File("D:\\testing.txt");
        	FileReader fr = new FileReader(file);
        	
        }
        catch(SecurityException | IOException e){
        	System.out.println("----------- File Not Found Exception is caught here -------------");
        	FileHandler fh2 = new FileHandler("C:\\Users\\om.modi\\Desktop\\Filelog.txt");
			log.addHandler(fh2);
        	log.log(Level.SEVERE, e.getMessage());
        }
        try {
        	int c = 2/0;
        	
        }
        catch(ArithmeticException | SecurityException e){
        	System.out.println("------- Arithmetic Exception is caught here -----------");
        	FileHandler fh3 = new FileHandler("C:\\Users\\om.modi\\Desktop\\Dividelog.txt");
			log.addHandler(fh3);
            log.log(Level.SEVERE, e.getMessage());
        }  
    }
}
