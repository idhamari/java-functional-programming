
interface Flyer{
	public default  void fly(){}; //abstract
}

class Bird implements Flyer{	
	@Override 
	public void fly(){
		System.out.println("Bird::@override  public void fly()");
	}
}

class Zoo {	
	public void fly1(){
		System.out.println("Zoo:: public void fly1()");
	}

	public void fly2(){
		System.out.println("Zoo:: public void fly2()");
		Bird obj = new Bird();
		obj.fly();
		System.out.println("Zoo::Done! fly2()");

	}
}

public class Demo1 {
	
	public static void main(String args []) {
		
		System.out.println("main hiii");

        new Zoo().fly2();  
	}

}
