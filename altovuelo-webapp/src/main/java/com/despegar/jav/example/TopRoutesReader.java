package com.despegar.jav.example;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import com.despegar.jav.json.JsonFactory;
import com.fasterxml.jackson.core.type.TypeReference;

public class TopRoutesReader {

	public static void main(String[] args) {
		TopRoutesReader reader = new TopRoutesReader();
		System.out.println(reader.getTopRoutes());
	}

	public List<TopRoute> getTopRoutes() {
		JsonFactory jsonFactory = new JsonFactory();
		InputStream inputStream = TopRoutesReader.class.getResourceAsStream("top_routes.json");
		return jsonFactory.fromJson(new InputStreamReader(inputStream), new TypeReference<List<TopRoute>>() {
		});
	}
}
