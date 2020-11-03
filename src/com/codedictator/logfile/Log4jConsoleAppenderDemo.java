package com.codedictator.logfile;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.codedictator.constant.Constants;
import com.codedictator.logger.utils.LoggerUtility;

public class Log4jConsoleAppenderDemo {
	private static Logger logger = LoggerUtility.getLogger("Log4jFileAppenderDemo.class");

	public static void main(String[] args) {
		PropertyConfigurator.configure(Constants.CONSOLE_APPENDER_PROPERTY_FILE);
		logger.debug("Log4j appender configuration is successful !!");
		logger.info("My New Log4J");
	}
}
