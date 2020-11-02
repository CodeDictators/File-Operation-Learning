package com.codedictator.textfile;

import java.io.File;

import com.codedictator.file.learning.constant.Constants;

public class DeleteFile {

	public static void main(String[] args) {
		File myObj = new File(Constants.TEXT_PATH);
		if (myObj.delete()) {
			System.out.println("Deleted the file: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}
	}
}