package com.codedictator.json;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWrite {
	public static void main(String[] args) throws FileNotFoundException {
		// Json object is created
		JSONObject job = new JSONObject();
		// Adding data using the created object
		job.put("firstName", "Kalpesh");
		job.put("lastName", "Mahajan");
		job.put("age", 26);

		// LinkedHashMap is created for address data
		Map m1 = new LinkedHashMap(4);
		m1.put("streetAdd", "Pimpri");
		m1.put("city", "Pune");
		m1.put("state", "Maharashtra");
		m1.put("pinCode", 456123);

		// adding address to the created JSON object
		job.put("address", m1);

		// JSONArray is created to add the phone numbers
		JSONArray jab = new JSONArray();
		m1 = new LinkedHashMap(2);
		m1.put("type1", "home");
		m1.put("no", "9876543210");

		// adding map to list
		jab.add(m1);
		m1 = new LinkedHashMap(2);
		m1.put("type2", "fax");
		m1.put("no1", "1234567890");

		// map is added to the list
		jab.add(m1);

		// adding phone numbers to the created JSON object
		job.put("phoneNos", jab);

		// the JSON data is written into the file
		PrintWriter pwt = new PrintWriter("static/JSON.json");
		pwt.write(job.toJSONString());
		pwt.flush();
		pwt.close();
	}
}
