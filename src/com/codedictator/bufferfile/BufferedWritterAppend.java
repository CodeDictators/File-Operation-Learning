package com.codedictator.bufferfile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.codedictator.constant.Constants;

public class BufferedWritterAppend {
	public static void main(String[] args) throws IOException {
		String textToAppend = "\nHappy Learning !!";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(Constants.TEXT_PATH, true));) {
			writer.write(textToAppend);
			System.out.println("Successfully wrote to the file.");
		}
	}
}
