package recursion;

import java.util.ArrayList;
import java.util.List;

public class FilesCounter {
	
	private int count() {
		
		Package pack = new Package();
		
		List<File> files = new ArrayList<File>();
		
		files.add(new Package());
		
		return 0; 
	}
	
	
	
	private class File {
		private Integer value;
		
		public File() {}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}
	}
	
	private class Package extends File {
		private List<File> files;
		
		public Package () {
			files = new ArrayList<File>();
		}

		public List<File> getFiles() {
			return files;
		}

		public void setFiles(List<File> files) {
			this.files = files;
		}
		
		
	}
}


