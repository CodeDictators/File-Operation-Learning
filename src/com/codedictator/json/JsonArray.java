package com.codedictator.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonArray {
	// calling the main method
	public static void main(String[] args) {
		JSONParser par = new JSONParser();
		String str = "[2,{\"3\":{\"4\":{\"5\":{\"6\":[7,{\"8\":9}]}}}}]";
		try {
			Object objc = par.parse(str);

			JSONArray array = (JSONArray) objc;
			System.out.println("The array's second element is");
			System.out.println(array.get(1));
			System.out.println();

			JSONObject objc2 = (JSONObject) array.get(1);
			System.out.println("Field \"2\"");
			System.out.println(objc2.get("2"));
			str = "{}";
			objc = par.parse(str);
			System.out.println(objc);
			str = "[7,]";
			objc = par.parse(str);
			System.out.println(objc);
			str = "[7,,2]";
			objc = par.parse(str);
			System.out.println(objc);
		} catch (ParseException pr) {
			System.out.println("The elements position is: " + pr.getPosition());
			System.out.println(pr);
		}
	}
}
