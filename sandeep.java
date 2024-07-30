package com.exception.e1;
class OverSpeedException extends Exception{
	
}
class speedmonitor{
	static void check(int speed) throws OverSpeedException{
		if(speed>60) {
			throw new OverSpeedException();
		}
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		try {
			speedmonitor.check(45);
			speedmonitor.check(75);
		}
		catch(OverSpeedException e) {
			System.err.println("Overspeed Alert Collect Fine");
		}
	}
}
