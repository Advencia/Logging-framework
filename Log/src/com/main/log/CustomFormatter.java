package com.main.log;

public class CustomFormatter {

	 public CustomFormatter(MyLogger log) {
		 StringBuilder buf = new StringBuilder();
		 if (Level.ERROR == log.getLevel()) {
	         buf.append("<td style='color:red'>");
	         buf.append(log.getLevel());
		 }
	 }
}
