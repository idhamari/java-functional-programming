
// nested lambda 
// multiple parameters lambda
import java.util.function.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.BiFunction;
import java.util.List;
import java.util.Random;
  
@FunctionalInterface
interface multiLambda<One, Two, Three, Four, Five, Six> {
    public Six apply(One one, Two two, Three three, Four four, Five five);
}

public class Demo5 {
	

	   public static void main(String args []) {
		
      Random r = new Random();
       
      // no parameters 
	  Function<Integer, Integer> randomm = a -> r.nextInt(500);	  
	  // one parameter
	  Function<Double, Double> half = a -> a / 2.0;	 
	  // two parameters 
	  BiFunction<Double, Double, Double> add = (a,b) ->  a+b;	  

	  // multiple parameters 
      // ???
	  // nested functions 
	  Function<Double, Double> quartle = a -> half.apply(half.apply(a));
   
	  // Applying the functions  
	  System.out.println(randomm.apply(0) );
	  System.out.println(half.apply(100.0));
	  System.out.println(add.apply(100.0, 50.0) );

	  System.out.println(half.apply(half.apply(100.0)));
	  System.out.println(quartle.apply(100.0) );

//	    multiLambda<String, Integer, Double, Void, List<Float>, Character> func = (a, b, c, d, e) -> 'z';	
	  multiLambda<Integer, Integer, Integer, Integer, Integer,Integer> mySum = (a1,a2,a3,a4,a5) -> a1+a2+a3+a4+a5;
	  System.out.println(mySum.apply(1,2,3,4,5) );

     
   } // main

 
	
}// class
