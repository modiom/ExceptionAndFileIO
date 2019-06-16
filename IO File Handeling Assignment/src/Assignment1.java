import java.io.File;
public class Assignment1 {
	public static void file_path(File file){
		   System.out.println("This is the full file path -->" + file.getAbsolutePath());
   }

   public static void main(String[] args) {
	      fileTree(new File("C:\\Users\\om.modi\\Desktop\\Directory"));
   }
	public static void fileTree(File directory){
		   File[] sub_directories=directory.listFiles();
		   for(File sub_dir: sub_directories)
		   {
			   if (sub_dir.isDirectory()){
				   fileTree(sub_dir);
			   } 
			   else {
			   file_path(sub_dir);
			   }
		   }
	   } 
		
		   
		   
}
