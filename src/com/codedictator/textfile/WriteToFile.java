package com.codedictator.textfile;

import java.io.FileWriter;
import java.io.IOException;

import com.codedictator.file.learning.constant.Constants;

public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter(Constants.TEXT_PATH);
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
