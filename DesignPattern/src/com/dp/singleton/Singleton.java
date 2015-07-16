package com.dp.singleton;

public class Singleton {
	private static Singleton singleton;
	private static Object classLock = Singleton.class;
	
	private long wipMoves;
	
	public static Singleton getSingleton(){
		synchronized(classLock) {
			if (singleton == null) {
				singleton = new Singleton();
				System.out.println("Singleton created");
			} else {
				System.out.println("Singleton already created");
			}
		}
		
		return singleton;
	}
	
	public void recordWipMove(){
		synchronized(classLock) {
			wipMoves ++;
			System.out.println(wipMoves);
		}
	}
}
