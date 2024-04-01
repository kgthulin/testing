package com.test.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest3 {

	public static void main(String[] args) {
		var path = Paths.get("/Users/kaungthulin/Workspace/spring-projects/TestingDateAndTime/ttt.txt");
		var path2 = Paths.get("/Users/kaungthulin/Workspace/spring-projects/TestingDateAndTime");
		System.out.println(path);
		try {
			if (Files.notExists(path)) {
				Files.createFile(path);
			}
			Path p = Files.createTempFile(path2, "log_", ".txt");
			System.out.println(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
