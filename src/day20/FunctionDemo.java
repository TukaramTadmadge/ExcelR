package day20;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	void greet()	//normal function
	{
		System.out.println("Welcome to Pune, Have a nice stay Virat!!!");
	}
	
	//convert normal function into lambda expression
	//plus(2)        minus(4)
	//				 access specifier
	//			 	 return type
	//			  	 function name
	//				 data type of the function arguements
	//->
	//;
	
	/*e.g 1
	greet()	//after minus return type
	{
		System.out.println("Welcome to Pune, Have a nice stay Virat!!!");
	}
	
	()		//after minus function name
	{
		System.out.println("Welcome to Pune, Have a nice stay Virat!!!");
	}
	
	()->		//after plus -> operator
	{
		System.out.println("Welcome to Pune, Have a nice stay Virat!!!");
	}
	
	()->		//after plus ; (final version of lambda expression)
	{
		System.out.println("Welcome to Pune, Have a nice stay Virat!!!");
	};
	
	e.g 2
	
	public void area()		//Normal Function
	{
	System.out.println("Area of Circle is " + Math.PI*5*5);
	}
	
	()->{System.out.println("Area of Circle is " + Math.PI*5*5);};   //lambda expression
	
	
	public void area(int radius)		//Normal Function
	{
	System.out.println("Area of Circle is " + Math.PI*radius*radius);
	}
	
	(radius)->		//lambda Expression
	{
	System.out.println("Area of Circle is " + Math.PI*radius*radius);
	};
	
	
	public void area(int length,int width)		//Normal Function
	{
	System.out.println("Area of Rectangle is " + length*width);
	}
	
	(length,width)->		//Basic Lambda expression 
	{
	System.out.println("Area of Rectangle is " + length*width);
	};
	
	
	variance 1:
	(radius)->		//function parameters are there ?  single
	{				//if function parameters is single we can skip the ()
	System.out.println("Area of Circle is " + Math.PI*radius*radius);
	};
	
	radius->		
	{				
	System.out.println("Area of Circle is " + Math.PI*radius*radius);
	};
	
	
	variance 2 :   //function body is how many lines ? single line
				   // we can skip the  { }
	
	radius-> System.out.println("Area of Circle is " + Math.PI*radius*radius);
	
	NOTE : skip the { } if and only if when the function body is single line   //Salman expression
		   Salman expression "return keyword" embeded - so no need to write explicitly
		   
	public int area(int length,int width)		//Normal Function
	{
	return length*width;
	}
	
	
	(length, width)-> length*width;
	(length, width)-> {return length*width};
	
	
	public int factorial(int num)		//normal function
	{
	int fact=1;
	for(int i=1;i<=num;i++)
	{
	fact=fact*i;
	}
	return fact;
	}
	
	
	num->		//normal function
	{
	int fact=1;
	for(int i=1;i<=num;i++)
	{
	fact=fact*i;
	}
	return fact;
	}
	
	//NOTE : when multiline then {} + return
	//		 when singleline then no {} no return
	
	
	public double calcSimpleInterest(double principle,double rate, double numberOfYears)		//Normal Function
	{
		double si=(principle*rate*numberOfYears)/100;
		return si;
	}
	   
	version 1:
	(principle,rate,numberOfYears)->		//Normal Function
	{
		double si=(principle*rate*numberOfYears)/100;
		return si;
	};
	
	version 2:
	(principle,rate,numberOfYears)->		//Normal Function
	{
		return (principle*rate*numberOfYears)/100;
	};
	
	version 3:
	(principle,rate,numberOfYears)->		//Normal Function
		(principle*rate*numberOfYears)/100;
	
	*/
	
	
}


//lambda expression         +         functional interface
// 50 % 
// Socks					+			Shoes          = 1 unit
// mobile					+           charger
// sweet box			    +           cap				= 1 unit
// notebook                 +           pen             = 1 unit


//conjunction in english grammer
//And 
//or
//sentance to elongate a sentance
//My Name is Umar
//I stay in Pune
//My Name is Umar and I stay in Pune
//Lambda and functional interface will form 1 unit


//functional interface which follows SAM (ONLY Single Abstract Method)

