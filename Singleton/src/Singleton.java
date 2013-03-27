
public class Singleton {

	private static Singleton mSingleton = null;
	
	private Singleton() {
	}
	
	public static synchronized Singleton getInstance(){
		if(mSingleton == null){
			mSingleton = new Singleton();
		}
		return mSingleton;
	}
}
