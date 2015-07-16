package com.dp.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Singleton singleton = new Singleton();
		singleton.getSingleton();
		singleton.recordWipMove();
		singleton.getSingleton();
		singleton.recordWipMove();
	}

}
