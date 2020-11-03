package com.codedictator.bufferfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.codedictator.constant.Constants;

public class BufferReader {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader(Constants.TEXT_PATH); BufferedReader br = new BufferedReader(fr);) {
			int i;
			while ((i = br.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
