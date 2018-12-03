package Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	}
	public static HashMap<Integer,String> readFileToHashMap() throws FileNotFoundException {
		
		final String workDir = System.getProperty("user.dir");{
			System.out.println(workDir);
		}
			final String filename = "file12321.txt";{
			System.out.println(filename);
			}
		
		
		File file = new File(workDir,filename);
		
		HashMap<Integer,String> names = new HashMap<>();
		Scanner in = null;
		try {
			if (file.exists()) {
				in = new Scanner(file);
				while (in.hasNextLine()) {
					names.put(in.nextInt(),in.nextLine());
				}
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}

		System.out.println(readFileToHashMap());
		
		return names;
		
	}

}