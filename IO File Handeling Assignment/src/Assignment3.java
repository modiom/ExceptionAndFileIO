import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inputFile = new File("C:\\\\\\\\Users\\\\\\\\om.modi\\\\\\\\Desktop\\\\\\\\Arraylog.txt");
		File outputFile = new File("C:\\\\\\\\Users\\\\\\\\om.modi\\\\\\\\Desktop\\\\\\\\ArraylogOutput.txt");
		try {
			FileInputStream inputStream = new FileInputStream(inputFile);
			FileOutputStream outputStream = new FileOutputStream(outputFile);
			byte[] copyBuffer = new byte[1024];
	         int inputLen;
	         
	         while ((inputLen = inputStream.read(copyBuffer)) > 0) {
	            outputStream.write(copyBuffer, 0, inputLen);
	         } 
	         inputStream.close();
	         outputStream.close();
	         System.out.println("File contents copied successfully!!");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
