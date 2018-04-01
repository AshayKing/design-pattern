package com.ashayking.coder.singleton;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class SingletonClient {

	public static void main(String[] args) {

		System.out.println("Eager Singleton");
		DBEagerSingleton eagerSingleton = DBEagerSingleton.getInstance();
		System.out.println(eagerSingleton);
		DBEagerSingleton oneMoreEagerSingleton = DBEagerSingleton.getInstance();
		System.out.println(oneMoreEagerSingleton);

		System.out.println("Lazy Singleton");
		DBLazySingleton lazySingleton = DBLazySingleton.getInstance();
		System.out.println(lazySingleton);
		DBLazySingleton oneMoreLazySingleton = DBLazySingleton.getInstance();
		System.out.println(oneMoreLazySingleton);

		System.out.println("Lazy + ThreadSafe Singleton");
		DBLazyThreadSafeSingleton lazyThreadSafeSingleton = DBLazyThreadSafeSingleton.getInstance();
		System.out.println(lazyThreadSafeSingleton);
		DBLazyThreadSafeSingleton oneMoreLazyThreadSafeSingleton = DBLazyThreadSafeSingleton.getInstance();
		System.out.println(oneMoreLazyThreadSafeSingleton);

	}
}
