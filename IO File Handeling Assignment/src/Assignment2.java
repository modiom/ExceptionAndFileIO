import java.io.File;
import java.util.ArrayList;
import java.util.List;
public class Assignment2 {
	static String directory = "C:\\Users\\om.modi\\Desktop";
	public static void main(String[] args){
		List<String> dirFile = findFiles(directory);
		System.out.println("---------------");
		System.out.println("Starting deleting .txt files");
		System.out.println("---------------");
	    for (String dir: dirFile) {
	    	File file = new File(dir);
	    	String fileName = file.getName();
	        if(file.delete()) { 
	            System.out.println(fileName + " deleted successfully"); 
	        } else{ 
	            System.out.println("Failed to delete " + fileName); 
	        }      
	    }
	}
	public static List<String> findFiles(String dirName){
		List<String> textFileNames = new ArrayList<String>();
		File dir = new File(dirName);
		for(File file:dir.listFiles()){
			if(file.getName().endsWith(".txt")){
				String tempPath = file.getAbsolutePath();
				System.out.println(tempPath);
				
				textFileNames.add(tempPath);
			}
		}
		return textFileNames;
	}
}
