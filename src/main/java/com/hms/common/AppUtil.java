package com.hms.common;

import java.util.List;

public class AppUtil {
	public static Boolean isNotNull(Integer value) {
		return value != null;
	}

	public static Boolean isNotNull(List<?> list) {
		return list != null && list.size() != 0;
	}
}
