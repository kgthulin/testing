package com.test.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) {
		var file = new File("test.txt");
		System.out.println(file);
		try {
			if (file.createNewFile()) {
				System.out.println("Success");
			} else {
				System.out.println("Fail");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file.canRead());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		System.out.println(file.getAbsoluteFile());
		try {
			BufferedReader br = new BufferedReader(new FileReader(file.getAbsoluteFile()));
			String text = "";
			try {
				while ((text = br.readLine()) != null) {
					System.out.println(text);
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
