package design.patterns.singleton;

public class Singleton {
	
	private Singleton(){
		
	}

	private static class LazyHolder{
		static final Singleton INSTANCE = new Singleton();
		
	}
	
	public static Singleton getInstance(){
		return LazyHolder.INSTANCE;
	}

}
