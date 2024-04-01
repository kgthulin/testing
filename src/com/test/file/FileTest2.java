package com.test.file;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {

	public static void main(String[] args) {
		try (var data_output = new DataOutputStream(new FileOutputStream(new File("testing.txt")));
			var bw = new BufferedWriter(new FileWriter(new File("testingggg.txt")))) {
			data_output.writeBytes("This is java program");
			System.out.println(data_output.size());
			
			bw.write("Hello and Hola Holy shit");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
