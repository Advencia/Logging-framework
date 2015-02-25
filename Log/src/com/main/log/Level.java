package com.main.log;

public enum Level {
	
	INFO(1),DEBUG(2), ERROR(3);
	
	private int levelValue;
	
	private Level(int levelValue) {
		
		this.levelValue = levelValue;
	}
	
	public int getLevelValue() {
		
		return levelValue;
	}
	
}
