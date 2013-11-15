package com.omm.helper;

import com.google.gson.Gson;

public abstract class JSONHelper {
	public static String toJSON(Object param) {

		Gson gson = new Gson();

		return gson.toJson(param);
	}
}
