package com.codedictator.csvfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.codedictator.constant.Constants;

import au.com.bytecode.opencsv.CSVWriter;

public class WriteToCSV {
	public static void main(String[] args) {
		try (CSVWriter write = new CSVWriter(new FileWriter(new File(Constants.CSV_PATH), false), ',',
				CSVWriter.NO_QUOTE_CHARACTER);) {

			String[] emp1 = { "Kalpesh", "XYZ", "3" };
			String[] emp2 = { "Bunny", "XYZ", "007" };

			List<String[]> list = new ArrayList<>();

			list.add(new String[] { "firstName", "lastName", "id" });
			list.add(new String[] { "Venkat", "ABC", "1" });
			list.add(new String[] { "Sunil", "PQR", "2" });
			list.add(emp1);
			list.add(emp2);

			write.writeAll(list);
			write.flush();
			System.out.println("Done!!!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
