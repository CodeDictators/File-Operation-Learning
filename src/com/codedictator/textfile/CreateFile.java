package com.codedictator.textfile;

import java.io.File;
import java.io.IOException;

import com.codedictator.file.learning.constant.Constants;

public class CreateFile {
	public static void main(String[] args) {
		try {
			File myObj = new File(Constants.TEXT_PATH);
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
