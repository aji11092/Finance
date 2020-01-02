package com.finance.util;


public class TextUtil {
	private TextUtil() {
		  throw new IllegalStateException("TextUtil class");
	}
	/**
	 * Performs null and empty check.
	 * @param value
	 * @return
	 */
	public static boolean isEmpty(String value) {
		return value == null || value.isEmpty() || value == "";
	}

}
