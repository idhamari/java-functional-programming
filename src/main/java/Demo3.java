
// using threads with the inner class concept!!!
//class Music implements Runnable{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//	 	System.out.println("Music:: public void run() ");
//	}
//	
//}


public class Demo3 {
	public static void main(String args []) {
		
		System.out.println("main hiii");
//        Music m = new Music();
		Runnable m = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
			 	System.out.println("Music:: public void run() ");
			}
		};
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);

        t1.start();
        t2.start();

	}

}
