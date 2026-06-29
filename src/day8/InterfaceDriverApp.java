package day8;

public class InterfaceDriverApp {

	public static void main(String[] args) {
		Horse h1=new Horse();
		h1.eat();
		h1.sleep();
		h1.run();
		
		Animal h2=new Horse();
		h2.eat();
		h2.sleep();
		h2.run();
		
		
		Animal t1=new BengalTiger();
		Tiger t2=new BengalTiger();
		BengalTiger t3=new BengalTiger();
		
		t1.eat();
		t1.sleep();
		t1.run();
		
		
		t2.eat();
		t2.sleep();
		t2.run();
		
		
		t3.eat();
		t3.sleep();
		t3.run();
		t3.dance();
		
		
		Shape f1=new FootballField();			//A	- most widely
		Rectangle f2=new FootballField();		//B
		FootballField f3=new FootballField();	//C
		
	}

}

//can we create an instance/object of abstract class ?     close ended question  NO
//when is constructor invoked implicitly?     when an object is created

// can an abstract class have a constructor ? 

//Vibhanshu 	No
//Aditi 		No
//Ashish  		Yes
//Hari Kailash 	No
//Hemanth		No
//Omkar			Yes
//Surendra		No
//Sarwar		No

//Yes

//Man earns 50,000 
//Mother cooks 10 chapati's



/*

class A
{
void one();
}

class B
{
void two();
}

class C extends A,B   //multiple inheritance
{
}


does java support multiple inheritance ?  close ended :  NO
with regards to class java does not support multiple inheritance
at any given point of time 1 class can have only 1 single super class.

but with regards to interfaces  java supports multiple inheritance

option 1:
interface A
{
void one();
}

interface B
{
void two();
}

interface C extends A,B   //multiple inheritance  : is it allowed
{
void one();
void two();
}


class D implements C
{
}



Option 2:
interface A
{
void one();
}

interface B
{
void two();
}

interface A
{
void three();
}


class D implements A,B,C
{

}


option 3:

Option 2:
interface A
{
void one();
}

interface B
{
void two();
}

abstract class C
{
abstract void three();
}


class D extends C implements A,B
{

}

 */

//encapsulation data hiding

//bundling the data member and methods into a single unit known as class is called encapsulation
//data hiding is using access specifies private : read (getter)  write(setter)
//which is that method which takes exaclty 1 arguement?  setter method, copy constructor


// interace  Bank
// deposit(), withdraw(), checkBal, transferMoney(), createAccount()
// class HDFCBank implements Bank