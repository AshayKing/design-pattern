package com.ashayking.coder.singleton;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class DBLazySingleton {

	private static DBLazySingleton singleton = null;

	private DBLazySingleton() {

	}

	public static DBLazySingleton getInstance() {
		if (singleton == null) {
			singleton = new DBLazySingleton();
		}
		return singleton;
	}
}
