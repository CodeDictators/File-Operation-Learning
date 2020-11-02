package com.codedictator.csvfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.codedictator.file.learning.constant.Constants;

public class ReadFromCSVFileUseDelimiter {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new File(Constants.CSV_PATH));) {
			sc.useDelimiter(",");
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
