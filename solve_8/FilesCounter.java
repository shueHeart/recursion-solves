import java.io.File;

public class FilesCounter {
	
	public static int count(String path) {
		
		File folder = new File(path);
		
		return count(folder.listFiles(), 0);
		
	}
	
	public static int count(File[] files, int index) {
				
		if (index >= files.length) return 0; 
		
		if (files[index].isDirectory()) {
			return count(files, index + 1) + count(files[index].listFiles(), 0);
		}
		
		return 1 + count(files, index + 1);
	}
	
}

