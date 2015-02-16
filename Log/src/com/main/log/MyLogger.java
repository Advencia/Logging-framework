package com.main.log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Date;

public class MyLogger {
	private Level level;
	String date = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE).format(new Date());
	Calendar cal = Calendar.getInstance();
    int hours = cal.get(Calendar.HOUR_OF_DAY);
    int minutes = cal.get(Calendar.MINUTE);
    String hour = hours+":"+minutes;
    
	/***affiche message log dans la console****/
	void log(Level niveau, String msg) {
		
		System.out.println(date +" "+ hour +" "+ niveau +":"+msg);
	}
	
	/****affichage message log dans un fichier****/
	void logFile(String msg){
		LogFile lFile = new LogFile(msg);
	}
	
	/***affiche log console avec un level associé****/
	void info(String msg) {
		System.out.println(date +" "+ hour +" INFO:"+msg);
	}
	void warning(String msg){
		System.out.println(date +" "+ hour +" WARNING:"+msg);
	}
	
	void error(String msg){
		System.out.println(date +" "+ hour +" ERROR:"+msg);
	}
	
	/*************Params level***************/
	void setLevel(Level level){
		this.level = level;
	}
	
	Level getLevel(){
		return level;
	}

}
