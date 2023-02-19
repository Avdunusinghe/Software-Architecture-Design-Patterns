package com.sa.singleton;

public class Singleton {
	
	public Singleton() {
		
	}
	
	private static Singleton instence;
	
	public static Singleton getInstance()
	{
		if(instence ==  null) {
			instence = new Singleton();
		}
		
		return instence;
	}
	
	public void accessSingletonObj() {
		System.out.println("Method called , Object created");
	}

}
