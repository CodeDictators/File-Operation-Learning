package com.codedictator.logger.utils;

import org.apache.log4j.Logger;

public class LoggerUtility {

	private LoggerUtility() {
	}

	public static Logger getLogger(String name) {
		return Logger.getLogger(name);
	}

}
