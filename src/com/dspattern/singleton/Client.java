 package com.dspattern.singleton;

public class Client {

	public static void main(String[] args) {
		//EagerRegistry registry = new EagerRegistry();
		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();
		
		System.out.println(registry == registry2);
	}

}
