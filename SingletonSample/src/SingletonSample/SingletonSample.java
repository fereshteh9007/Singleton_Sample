/******************************************************************************/
/* Fereshteh Rohani                                                           */
/******************************************************************************/

package SingletonSample;

public class SingletonSample {
	
	private static SingletonSample singletonInstance;
	
	private SingletonSample() {
		
	}
	
	public static SingletonSample getInstance() {
		if(singletonInstance == null) {
			singletonInstance = new SingletonSample();
		}
		return singletonInstance;
	}
	
}
