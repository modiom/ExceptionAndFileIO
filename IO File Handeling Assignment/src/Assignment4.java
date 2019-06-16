import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Assignment4 {

	private static void copyFile(File source, File destination) throws IOException {
		Files.copy(source.toPath(), destination.toPath(),StandardCopyOption.REPLACE_EXISTING);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File source = new File("C:\\\\Users\\\\om.modi\\\\Desktop\\\\Arraylog.txt");
        File dest = new File("C:\\\\Users\\\\om.modi\\\\Documents\\\\Arraylogcopy.txt");
        try {
			copyFile(source, dest);
			System.out.println("File is successfully copied to other directory!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
