package DesginPatterns;

//eg - 	sharing a single washing machine among all the residents in a hotel

public class StaticBlockInitialization {
	private static StaticBlockInitialization instance;
	
	  // private constructor to avoid client applications using the constructor
	private StaticBlockInitialization() {
		
	}
	static {
		try {
			instance = new StaticBlockInitialization();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	StaticBlockInitialization getInstance(){
		return instance;
	}
}
