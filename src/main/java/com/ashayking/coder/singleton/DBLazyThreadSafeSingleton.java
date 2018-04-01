package com.ashayking.coder.singleton;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class DBLazyThreadSafeSingleton {

	private static DBLazyThreadSafeSingleton singleton = null;

	private DBLazyThreadSafeSingleton() {

	}

	public static DBLazyThreadSafeSingleton getInstance() {
		if (singleton == null) {
			synchronized (DBLazyThreadSafeSingleton.class) {
				if (singleton == null)
					singleton = new DBLazyThreadSafeSingleton();
			}
		}
		return singleton;
	}
}
