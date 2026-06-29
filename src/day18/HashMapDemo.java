package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Double> employees=new HashMap();
		employees.put("Alice",800.0);
		employees.put("Ben",900.0);
		employees.put("Chris",1000.0);
		employees.put("David",1100.0);
		
		employees.put("Chris",1500.0);
//		employees.put(null,100.0);
//		employees.put(null,101.0);
//		employees.put(null,102.0);
		
//		employees.put("Frank",null);
//		employees.put("George",null);
//		employees.put("Henry",null);
		System.out.println(employees);
		
		System.out.println(employees.keySet());
		
		System.out.println(employees.values());
		
		System.out.println(employees.entrySet());
		
		System.out.println(employees.get("Ben"));
		
		System.out.println(employees.containsKey("Virat"));
		
		System.out.println(employees.size());
		
		//display name of employee with max salary
		int arr[]= {1,5,17,2,4};
		
		int max=0;
		for(int n:arr)
		{
			if(n>max)
				max=n;
		}
		System.out.println("Maximum number from Array " +max);
		
		double maxSalary=0.0; //1500 
		String maxEmployeeName=null;  //Chris
		
		for(Entry<String,Double> emp:employees.entrySet())
		{
			if(emp.getValue()>maxSalary)
			{
				maxSalary=emp.getValue();
				maxEmployeeName=emp.getKey();
			}
		}
		
		System.out.println("Name of Employee with max Salary is "+maxEmployeeName);
		/*m100
		"first" = [18,"Virat",78.5]
		"second" = [45,"Rohit",88.5]
		"third" = [1,"Rahul",68.6]*/
		
		HashMap<String,Student> m100=new HashMap();
		m100.put("first", new Student(18,"Virat",78.5));
		m100.put("second", new Student(45,"Rohit",88.5));
		m100.put("third", new Student(1,"Rahul",68.5));
		
		System.out.println(m100);
		
		//display name of the student who has come first in 100m
		System.out.println(m100.get("first").getSname());
		
		
		HashMap<String,Student> m200=new HashMap();
		m200.put("first", new Student(77,"Shubman",78.5));
		m200.put("second", new Student(33,"Hardik",88.5));
		m200.put("third", new Student(4,"Vaibhav",68.5));
		
		//display name of the student who has come third in 200m
		System.out.println(m200.get("third").getSname());
		
		
		ArrayList<HashMap<String,Student>> olympics=new ArrayList();
		olympics.add(m100);
		olympics.add(m200);
		
		System.out.println(olympics);

		//display name of the student who has come first in 100m using olympic
		System.out.println("name of the student who has come first in 100m");
		System.out.println(olympics.get(0).get("first").getSname());
		
		//display name of the student who has come third in 200m using olympic
		System.out.println("name of the student who has come third in 200m");
		System.out.println(olympics.get(1).get("third").getSname());
		
		//display name of the student who has come first in both the races
		
		System.out.println("name of the student who has come first in both the races");
		for(HashMap<String,Student> race:olympics)
		{
			System.out.println(race.get("first").getSname());
		}
	}

}
