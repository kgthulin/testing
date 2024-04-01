package com.test.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileTest4 {

	public static void main(String[] args) {
		Path first = Paths.get("/Users/kaungthulin/Workspace/spring-projects/TestingDateAndTime/firstDirectory");
		Path second = Paths.get("/Users/kaungthulin/Workspace/spring-projects/TestingDateAndTime/secondDirectory");
		try {
			Files.createDirectory(first);
			Files.createDirectory(second);
			
			Path file1 =  first.resolve("filecopy.txt");
			Path file2 = second.resolve("filecopy.txt");
			
			Files.createFile(file1);
			Files.createFile(file2);
			
			Files.copy(file1, file2, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
