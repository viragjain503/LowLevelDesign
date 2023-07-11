package DesginPatterns;

//Lazy initialization method to implement the singleton pattern creates the instance in the global access method. Here is the sample code for creating the singleton class with this approach:

//eg - 	sharing a single washing machine among all the residents in a hotel

public class LazyInititalizationDesignPattern {
	private static LazyInititalizationDesignPattern instance;
	private LazyInititalizationDesignPattern() {};
	
	public static LazyInititalizationDesignPattern getInstance(){
		if(instance == null) {
			instance = new LazyInititalizationDesignPattern();
		}
		return instance;
	}
}
