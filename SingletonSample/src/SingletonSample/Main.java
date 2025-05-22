/******************************************************************************/
/* Fereshteh Rohani                                                           */
/******************************************************************************/

package SingletonSample;

public class Main {

	public static void main(String[] args) {
		
		SingletonSample singletonObject_1 = SingletonSample.getInstance();
		SingletonSample singletonObject_2 = SingletonSample.getInstance();

		if(singletonObject_1 == singletonObject_2) {
			System.out.println("Two objects are the same!");
		}else{
			System.out.println("Two objects are not the same!");
		}
	}

}
