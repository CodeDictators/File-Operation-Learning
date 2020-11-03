package com.codedictator.logfile;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.codedictator.constant.Constants;
import com.codedictator.logger.utils.LoggerUtility;

public class Log4jMySqlAppenderDemo {
	private static Logger log = LoggerUtility.getLogger("Log4jMySqlAppenderDemo.class");

	public static void main(String[] args) {
		PropertyConfigurator.configure(Constants.SQL_APPENDER_PROPERTY_FILE);

		log.debug("Debug");
		log.info("Info");
	}
}
