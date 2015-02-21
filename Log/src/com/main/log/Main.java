package com.main.log;

public class Main {
 
  public static void main(String [] args){
	  Level lvl;
	  
	  MyLogger log1 = new MyLogger();
	  MyLogger log2 = new MyLogger();
	  MyLogger log3 = new MyLogger();
	  
	  log1.log(Level.INFO, "démarrage de l'application");
	  log2.info("pay attention !");
	  lvl = log1.getLevel();
	  System.out.println("niveau de severité :" + lvl);
	  
	  log3.logFile("testing");
	}
}
