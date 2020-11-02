package com.codedictator.textfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.codedictator.file.learning.constant.Constants;

public class ReadFromFile {
	public static void main(String[] args) {
		try {
			File myObj = new File(Constants.TEXT_PATH);
			// Get file Info
			if (myObj.exists()) {
				System.out.println("File name: " + myObj.getName());
				System.out.println("Absolute path: " + myObj.getAbsolutePath());
				System.out.println("Writeable: " + myObj.canWrite());
				System.out.println("Readable " + myObj.canRead());
				System.out.println("File size in bytes " + myObj.length());
			}
			Scanner myReader = new Scanner(myObj);

			// Read File Contents
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
