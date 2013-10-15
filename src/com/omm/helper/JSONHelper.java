package com.omm.helper;

import com.google.gson.Gson;

public abstract class JSONHelper {
	public static String toJSON(Object param) {
		// instanciar parser
		Gson gson = new Gson();
		
		// transformar em texto formar json
		return gson.toJson(param);
	}
}
