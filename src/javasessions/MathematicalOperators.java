package javasessions;

public class MathematicalOperators {

	public static void main(String[] args) {
		
    System.out.println(10/2);
    System.out.println(9/2); //if both numbers are intiger than ans also intiger
		
	System.out.println(9/2.0);	
	System.out.println(9.0/2); // at least one number should be float than ans will be flaot
	System.out.println(9/2f);
	System.out.println(9.0/2.0);
	
	System.out.println(12.36/4); 
	
	//System.out.println(9/0); //ArithmeticException ---> runtime 
	//System.out.println(0/0); //ArithmeticException ---> runtime 

	System.out.println(0/9); //0
    System.out.println(0/12.33);//0.0
	System.out.println(9.0/0); //Infinity (because special treatment for float and double values)
	System.out.println(9/0.0); //Infinity (because special treatment for float and double values)
	System.out.println(9.0/0.0); //Infinity
	
	System.out.println(0.0/0.0); //NaN (Not a number)
    System.out.println(0/0.0); //NaN (Not a number)
    System.out.println(0.0/0); //NaN (Not a number)
    
    System.out.println('a'/'a'); //1
   // System.out.println('a'/0); //ArithmeticException
    System.out.println(0/'a'); //0
    
    System.out.println(10%2);//0
    System.out.println(9%2);//1
    System.out.println(100%5);//0
    System.out.println(100%3);//1
    System.out.println(17%3);//2
    
    System.out.println(9.2%2);//1.1999
    System.out.println(0%10); //0
    //System.out.println(10%0);//AE
    
    System.out.println(2%10);//2 (1st no should be greater than the 2nd no if it is not than it will give always the same no)
    System.out.println(5%10);//5
    System.out.println(7%10);//7
    
    System.out.println("Hi I love java coding");
    
    System.out.println("Hi I love \"Java\" coding");
    // Hi I love "Java" coding

    byte b1 = 10;
    byte b2 = 30;  
    //byte b3 = b1+b2; //Whenever we add byte and short data type, we need to use an integer data type.
    
    short v1 = 1000;
    short v2 = 2000;
    int v3 = v1+v2;
    
    byte b4 = (byte)300;
    System.out.println(b4); //44 ans will be random nos
    
    
    		
    
    
	}

}
