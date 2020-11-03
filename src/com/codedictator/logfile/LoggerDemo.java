package com.codedictator.logfile;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import com.codedictator.constant.Constants;

public class LoggerDemo {

	public static void main(String[] args) throws IOException {
		FileHandler handler = new FileHandler(Constants.LOG_PATH, true);

		Logger logger = Logger.getLogger(LoggerDemo.class.getName());

		logger.addHandler(handler);
		handler.setFormatter(new MyCustomFormatter());

		logger.info("custom formatter - info message");
		logger.info("custom - info message");
	}
}

class MyCustomFormatter extends Formatter {

	@Override
	public String format(LogRecord record) {
		StringBuilder sb = new StringBuilder();
		sb.append("Prefixn\n");
		sb.append(record.getMessage());
		sb.append("\nSuffixn");
		sb.append("\n");
		return sb.toString();
	}
}