
// Note that we can only use lambda when  


public class Demo4 {
	public static void main(String args []) {
		
		System.out.println("main hiii");
		
		//Old way 
		Runnable m = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
			 	System.out.println("Music:: public void run() ");
			}
		};
        Thread t1 = new Thread(m);
                
        // Lambda way
        Runnable r = () -> System.out.println("Music:: public void run() ");
        Thread t2 = new Thread(r);
      
        t1.start();
        t2.start();
 
	}

}
