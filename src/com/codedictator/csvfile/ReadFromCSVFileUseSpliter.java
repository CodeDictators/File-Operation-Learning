package com.codedictator.csvfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.codedictator.file.learning.constant.Constants;

public class ReadFromCSVFileUseSpliter {
	public static void main(String[] args) {
		String line;
		String split = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(Constants.CSV_PATH));) {
			while ((line = br.readLine()) != null) {
				String Student[] = line.split(split);
				System.out.println(
						"Student [firstName: " + Student[0] + ",lastName: " + Student[1] + ",ID: " + Student[2] + "]");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
