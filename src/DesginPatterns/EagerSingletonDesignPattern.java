package DesginPatterns;

//In eager initialization, the instance of the singleton class is created at the time of 
//class loading. The drawback to eager initialization is that the method is created
//even though the client application might not be using it. 
//Here is the implementation of the static initialization singleton class:

// eg - 	sharing a single washing machine among all the residents in a hotel

public class EagerSingletonDesignPattern {
		private static final EagerSingletonDesignPattern instance = new EagerSingletonDesignPattern();
		
		private EagerSingletonDesignPattern() {
			
		}
		public static EagerSingletonDesignPattern getInstance(){
			return instance;
		}
		
		public static void main(String[] args) {
			EagerSingletonDesignPattern instance = EagerSingletonDesignPattern.getInstance();
			System.out.println();
		}
}
