package day2;

public class ArrayDemo2 {

	public static void main(String[] args) {
		//        day 1   2   3   4
		int daily[]= {100,200,300,400,500,700,800}; 
		int lightBill=800;
		int sum=0;
		//on which day can he pay his light bill  ans: day 4
		for (int i = 0; i < daily.length; i++)   //classical / traditional for loop
		{
			sum=sum+daily[i];
			if(sum>=lightBill)
			{
				System.out.println("Day "+(i+1));
				break;
			}
		}
		
		
	}

}
