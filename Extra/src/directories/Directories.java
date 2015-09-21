package directories;

import java.io.File;

public class Directories {

	public static void main(String[] args) {
		File file = new File("C:/VoorbeeldenWorkspace/Extra/src/directories");
		File[] array = file.listFiles();
		for (File file2 : array) {
			System.out.println(file2.getAbsolutePath());
		}
	}

}
