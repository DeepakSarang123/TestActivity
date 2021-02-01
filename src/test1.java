import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) throws IOException, ParseException {

		/*
		 * Files.move(new
		 * File("C:\\Users\\DEEPAK\\Documents\\FILEST~1\\DESTIN~1\\DC2695~1.DMP").toPath
		 * (), new
		 * File("C:\\Users\\DEEPAK\\Documents\\Files to be converted\\Destination\\rom")
		 * .toPath(), StandardCopyOption.REPLACE_EXISTING);
		 */

		System.out.println("Enter path of file");
		Scanner sc = new Scanner(System.in);
		String param = sc.nextLine();
		param = param.replace("\\", "\\\\");

		System.out.println(param);

	}

}
