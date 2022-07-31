/*
 *  Here we remove the class that implements the interface and define it 
 *  as an inner class
 */
interface Flyer2{
	public default  void fly(){}; //abstract
}


class Zoo2 {	
	public void fly1(){
		System.out.println("Zoo:: public void fly1()");
	}

	public void fly2(){
		System.out.println("Zoo:: public void fly2()");
		Flyer2 f = new Flyer2() {
			@Override 
			public void fly(){
				System.out.println("Flyer::@override  public void fly()");
			};
		};
		f.fly();

		System.out.println("Zoo::Done! fly2()");

	}
}

public class Demo2 {
	
	public static void main(String args []) {
		
		System.out.println("main hiii");

        new Zoo2().fly2();  
	}

}
