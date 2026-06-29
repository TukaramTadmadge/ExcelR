package day3;

public class RemoveDigitsFromString {

	public static void main(String[] args) {
		String str1="abc123def4";
		
		
		StringBuilder result=new StringBuilder("");
		for(char ch:str1.toCharArray())						//ch			result
		{													//'a'			""
			if(!Character.isDigit(ch))						//'b'			"a"
				result.append(ch);							//'c'			"ab"
		}													//'1'			"abc"
															//'2'			"abc"
		System.out.println(result);							//'3'			"abc"
	}														//'d'           "abcd"

}


//String 									StringBuilder							Stringbuffer
//immutable									mutable									mutable
//non synchronised							non synchronised						synchronised(thread)
