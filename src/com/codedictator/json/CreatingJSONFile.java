package com.codedictator.json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreatingJSONFile {
	public static void main(String[] args) {
		// Creating a JSONObject object
		JSONArray programmingLanguages = new JSONArray();
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Angular");

		JSONObject address = new JSONObject();
		address.put("city", "Pune");
		address.put("state", "MH");
		address.put("country", "Bharat");
		address.put("zip_code", 456123);

		JSONObject jsonObject = new JSONObject();
		// Inserting key-value pairs into the json object
		jsonObject.put("id", 1);
		jsonObject.put("first_name", "Kalpesh");
		jsonObject.put("is_developer", true);
		jsonObject.put("address", address);
		jsonObject.put("salary", 100.10);
		jsonObject.put("languages_known", programmingLanguages);
		jsonObject.put("null_val", null);

		try (FileWriter file = new FileWriter("static/output.json", true);) {// true for append in same file
			file.write(jsonObject.toJSONString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON file created: " + jsonObject);
	}
}
