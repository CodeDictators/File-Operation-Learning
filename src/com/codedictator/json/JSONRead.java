package com.codedictator.json;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONRead {
	public static void main(String[] args) throws Exception {

		// The file JSON.json is parsed
		Object objc = new JSONParser().parse(new FileReader("static/JSON.json"));

		// objc is convereted to JSON object
		JSONObject job = (JSONObject) objc;

		// obtaining the fname and lname
		String fName = (String) job.get("firstName");
		String lName = (String) job.get("lastName");
		System.out.println(fName);
		System.out.println(lName);

		// age is obtained
		long age1 = (long) job.get("age");
		System.out.println(age1);

		// address is obtained
		Map address = ((Map) job.get("address"));

		// iterating through the address
		Iterator<Map.Entry> itr = address.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry pair1 = itr.next();
			System.out.println(pair1.getKey() + " : " + pair1.getValue());
		}

		// phone numbers are obtained
		JSONArray jab = (JSONArray) job.get("phoneNos");

		// iterating phoneNumbers
		Iterator itr1 = jab.iterator();
		while (itr1.hasNext()) {
			itr = ((Map) itr1.next()).entrySet().iterator();
			while (itr.hasNext()) {
				Map.Entry pair1 = itr.next();
				System.out.println(pair1.getKey() + " : " + pair1.getValue());
			}
		}
	}
}
