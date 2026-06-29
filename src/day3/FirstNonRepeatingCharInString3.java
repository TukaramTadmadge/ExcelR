package day3;

public class FirstNonRepeatingCharInString3 {

	public static void main(String[] args) {
		//           012345
		String name="abbcad";
		
		char ch=firstRepeatedChar(name);
		System.out.println(ch=='0'? "No Repeated char found":ch);
	}

	private static char firstRepeatedChar(String name) {			//		ch
		for(char ch:name.toCharArray())								//0		a     if(0==4) false
			{														//1		b	  if(1==2) false
			if(name.indexOf(ch)==name.lastIndexOf(ch))				//2		b	  if(1==2) false
			{														//3		c	  if(3==3) true
				return ch;
			}
		}
		return '0';
	}
}
