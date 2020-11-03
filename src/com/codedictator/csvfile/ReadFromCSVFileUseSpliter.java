package com.codedictator.csvfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.codedictator.constant.Constants;

public class ReadFromCSVFileUseSpliter {
	public static void main(String[] args) {
		String line;
		String split = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(Constants.CSV_PATH));) {
			while ((line = br.readLine()) != null) {
				String[] student = line.split(split);
				System.out.println(
						"Student [firstName: " + student[0] + ",lastName: " + student[1] + ",ID: " + student[2] + "]");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
