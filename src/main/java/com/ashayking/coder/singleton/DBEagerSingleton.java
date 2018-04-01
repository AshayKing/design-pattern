package com.ashayking.coder.singleton;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class DBEagerSingleton {

	private static DBEagerSingleton singleton = new DBEagerSingleton();
	
	private DBEagerSingleton(){
		
	}
	
	public static DBEagerSingleton getInstance() {
		return singleton;
	}
}
