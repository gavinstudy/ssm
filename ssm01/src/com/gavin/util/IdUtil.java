package com.gavin.util;

import java.util.UUID;

public class IdUtil {
	public static String getIdUtil() {
		String id = UUID.randomUUID().toString().replaceAll("-", "");
		return id;
	}
}
