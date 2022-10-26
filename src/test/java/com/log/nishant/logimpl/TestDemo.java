package com.log.nishant.logimpl;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestDemo {

	//define Logger and create the logger object

	private static Logger logger=Logger.getLogger(TestDemo.class);

	//main method
	public static void main(String[] args) throws IOException {

		//create the layout for the logger 
		//Layout layout=new HTMLLayout();
		//Layout layout=new SimpleLayout();
		//Layout layout=new XMLLayout();
		//Layout layout=new PatternLayout("%C  %L %l [ %m ] %n");



		//create the appender and link the layout
		//Appender appender=new FileAppender(layout,"D:/logs.log");
		//Appender appender=new ConsoleAppender(layout);
		//link appender with logger 
		//logger.addAppender(appender);
		//print messages 
		logger.debug("From debug");
		logger.info("from appender");
		logger.warn("from warn");
		logger.error("from error");
		logger.fatal("from fatal");
		
	System.out.println("DONE");

	}
}
