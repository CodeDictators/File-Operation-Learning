package com.codedictator.json;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;

public class HashMapWithJSON {
	public static void main(String[] args) {

		HashMap<String, String> add1 = new HashMap<>();
		add1.put("City", "Pune");
		add1.put("State", "MH");
		add1.put("Country", "Bharat");
		add1.put("Zip", "123456");

		HashMap<String, String> add2 = new HashMap<>();
		add2.put("City", "Bengaluru");
		add2.put("State", "KA");
		add2.put("Country", "Bharat");
		add2.put("Zip", "987654");

		HashMap<String, HashMap<String, String>> myAddress = new HashMap<>();
		myAddress.put("Add1", add1);
		myAddress.put("Add2", add2);

		ArrayList<HashMap<String, HashMap<String, String>>> arrayList = new ArrayList<>();
		arrayList.add(myAddress);

		JSONArray jsArray2 = new JSONArray(arrayList);
		System.out.println(jsArray2);
	}
}
