package com.main.log;
import options.Color;
import options.CustomFormatter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Date;

public class MyLogger {
	
	private Level level;
	String msg;
    CustomFormatter format = new CustomFormatter(msg);
    
	/***affiche message log dans la console****/
	void log(Level niveau, String msg) {		
		System.out.println(format.getDateHour() +" "+ niveau +":"+msg);
	}
	
	/****affichage message log dans un fichier****/
	void logFile(String msg){
		LogFile lFile = new LogFile(format, msg);
	}
	
	/***affiche log console avec un level associé****/
	void info(String msg) {
		format = new CustomFormatter(msg);
		System.out.println(format.getDateHour() +" "+ Level.INFO+":"+msg);
		
	}
	void debug(String msg){
		System.out.println(format.getDateHour() +" "+ Level.DEBUG +":"+msg);
	}
	
	void error(String msg){
		System.out.println(format.getDateHour() +" "+ Level.ERROR +":"+msg);
	}
	
	/*************Params level***************/
	
	public Level getLevel(){
		return level;
	}
	
	void setLevel(Level level){
		this.level = level;
	}

}
