package day23;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		//System.out.println(new Employee(1, LocalDate.parse("2020-01-15"), LocalDate.parse("2013-05-20"), "January", "male", "IT", 2500.0).hashCode());
		List<Employee> employeesList = new ArrayList<>();

		employeesList.add(new Employee(1, LocalDate.parse("2020-01-15"), LocalDate.parse("2013-05-20"), "January", "male", "IT", 2500.0));
		employeesList.add(new Employee(2, LocalDate.parse("2019-03-10"), LocalDate.parse("1995-08-12"), "February", "female", "HR", 3200.0));
		employeesList.add(new Employee(3, LocalDate.parse("2021-07-05"), LocalDate.parse("1999-11-25"), "March", "male", "Finance", 2800.0));
		employeesList.add(new Employee(4, LocalDate.parse("2018-09-18"), LocalDate.parse("1992-01-30"), "April", "female", "Marketing", 4500.0));
		employeesList.add(new Employee(5, LocalDate.parse("2025-11-11"), LocalDate.parse("2005-03-12"), "May", "female", "Sales", 3000.0));
		employeesList.add(new Employee(6, LocalDate.parse("2024-06-23"), LocalDate.parse("2001-03-12"), "June", "male", "IT", 1900.0));
		employeesList.add(new Employee(7, LocalDate.parse("2022-08-14"), LocalDate.parse("1997-07-09"), "July", "male", "HR", 2700.0));
		employeesList.add(new Employee(8, LocalDate.parse("2017-12-20"), LocalDate.parse("1991-10-15"), "August", "female", "Finance", 5200.0));
		employeesList.add(new Employee(9, LocalDate.parse("2023-04-11"), LocalDate.parse("2000-06-18"), "September", "male", "Sales", 3100.0));
		employeesList.add(new Employee(10, LocalDate.parse("2016-02-28"), LocalDate.parse("1989-09-21"), "October", "female", "Marketing", 6000.0));
		employeesList.add(new Employee(11, LocalDate.parse("2021-10-09"), LocalDate.parse("1996-12-03"), "November", "male", "IT", 4100.0));
		employeesList.add(new Employee(12, LocalDate.parse("2019-05-17"), LocalDate.parse("1994-04-28"), "December", "female", "HR", 3500.0));
		employeesList.add(new Employee(13, LocalDate.parse("2019-05-17"), LocalDate.parse("1994-04-28"), "Monday", "female", "HR", 3500.0));
	
		//display names of all employees
		List<String> empNames=employeesList.stream()
		.map(employee->employee.getEname())
		.toList();
		
		System.out.println(empNames);
		
		
		//display names of all employees in sorted order (default Asc)
		List<String> empNamesSorted=employeesList.stream()
				.map(employee->employee.getEname())
				.sorted()
				.toList();
				
				System.out.println(empNamesSorted);
				
		//display names of all employees in sorted order (userdefined Desc)
				
		
		//display names of all employees working in IT dept without method referencing
		List<String> itDeptEmpNames=employeesList.stream()
				.filter(employee->employee.getDepartment().equalsIgnoreCase("IT"))
				.map(employee->employee.getEname())
				.toList();
		System.out.println(itDeptEmpNames);
		
		//display names of all employees working in IT dept with method referencing
				List<String> itDeptEmpNames1=employeesList.stream()
						.filter(employee->employee.getDepartment().equalsIgnoreCase("IT"))
						.map(Employee::getEname)
						.toList();
				System.out.println(itDeptEmpNames1);
				
				// display total salary using reduce
				double totalSalary=
						employeesList.stream()
						.map(emp->emp.getSalary())
						.reduce(0.0,(acc,sal)->acc+sal);
				
				System.out.println("Total Salary "+totalSalary);
				
				// display total salary numeric stream
				double totalSalary1=employeesList.stream()
				.mapToDouble(emp->emp.getSalary())
				.sum();
				System.out.println("Total Salary "+totalSalary1);
				
				// display average salary numeric stream
				double averageSalary=employeesList.stream()  //[null,null]
				.mapToDouble(Employee::getSalary)
				.average()
				.orElse(0.0);
				System.out.println("Average Salary "+averageSalary);
				
				// group employees based on dept
				//{"IT"=[{},{},{}], "Sales"=[{},{},{}], "HR"=[{},{}]}
				
				
				Map<String,List<Employee>> groupByDeptname=employeesList.stream()
						.collect(Collectors.groupingBy(Employee::getDepartment));
				
				System.out.println(groupByDeptname);
				
				// group employee names based on dept
				//{"IT"=["April","May","June"], "Sales"=["Nov",Dec"], "HR"=[]}
				Map<String,List<String>> groupEmpnamesByDeptname=employeesList.stream()
						.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(emp->emp.getEname(), Collectors.toList())));
				
				System.out.println(groupEmpnamesByDeptname);
				
				// count of employee  dept wise
				//{"IT"=3, "Sales"=2, "Finance"=2, HR=3}
				Map<String,Long> countEmpnamesByDeptname=
						employeesList.stream()
						.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
				System.out.println(countEmpnamesByDeptname);
				
				//display  dept with highest no of emps
				long countMaxEmployeesInDept=employeesList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
				.entrySet()
				.stream()
				.mapToLong(entry->entry.getValue())
				.max()
				.orElse(0);
				
				System.out.println(countMaxEmployeesInDept);
				
				//display  dept with highest no of emps
				employeesList.stream()
						.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
						.entrySet()
						.stream()
						.max(Map.Entry.comparingByValue())
						.ifPresent(entry->System.out.println(entry.getKey()));
				
				
				//return  dept with highest no of emps
				String dept1 =employeesList.stream()
						.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
						.entrySet()
						.stream()
						.max(Map.Entry.comparingByValue())
						.map(Map.Entry::getKey)
						.orElse(null);
				
				System.out.println(dept1);
						
			
				
				//Display names of all Gen-Z employees  1997-2012  born
				
				List<String> genZEmpNames=employeesList.stream()
				.filter(emp->emp.getDateOfBirth().isAfter(LocalDate.of(1997, 1, 1)) &&
						emp.getDateOfBirth().isBefore(LocalDate.of(2012, 1, 1)))
				.map(emp->emp.getEname())
				.toList();
				
				System.out.println(genZEmpNames);
				
				//Display names & Age of employees
				employeesList.stream()
				.forEach(
				emp->{
					int age=LocalDate.now().getYear() - emp.getDateOfBirth().getYear();
					System.out.println(emp.getEname() + " " + age);
					}
				);
				
				//Display names & Age of employees older than 30 years
				List<String> empNamesAbove30Years= employeesList.stream()
				.filter(emp-> LocalDate.now().getYear() - emp.getDateOfBirth().getYear()>=30)
				.map(Employee::getEname)
				.toList();
				
				System.out.println(empNamesAbove30Years);
				
				//Display names of youngest employee
				String youngestEmpName= employeesList.stream()
						.max(Comparator.comparing(Employee::getDateOfBirth))
					    .map(Employee::getEname)
					    .orElse(null);
				
				System.out.println(youngestEmpName);
				
				
				//Display names of eldest employee
				String eldestEmpName= employeesList.stream()
						.min(Comparator.comparing(Employee::getDateOfBirth))
					    .map(Employee::getEname)
					    .orElse(null);
				
				System.out.println(eldestEmpName);
				
				//Display names of most recently joined employee
				String mostRecentEmpName= employeesList.stream()
						.max(Comparator.comparing(Employee::getDateOfJoining))
					    .map(Employee::getEname)
					    .orElse(null);
				
				System.out.println("Most Recent Joiner " +mostRecentEmpName);
				
				
				//Display name of most experienced employee
				String mostExpEmpName= employeesList.stream()
						.min(Comparator.comparing(Employee::getDateOfJoining))
					    .map(Employee::getEname)
					    .orElse(null);
				
				System.out.println("Most Experienced Emp " +mostExpEmpName);
				
				//Group employees based on joining year
				
				//Map<Integer, List<Employee>>
				Map<Integer, List<Employee>> emps1=employeesList.stream()
				.collect(Collectors.groupingBy(emp->emp.getDateOfJoining().getYear()));
				
				System.out.println(emps1);
				
				//Group employee names based on joining year
				//Map<Integer, List<String>>
				Map<Integer, List<String>> emps2=employeesList.stream()
				.collect(Collectors.groupingBy(emp->emp.getDateOfJoining().getYear(),Collectors.mapping(Employee::getEname, Collectors.toList())));
				
				System.out.println(emps2);
				
				//display year wise number of joining employees
				//Map<Integer, Long>
				Map<Integer, Long> emps3=employeesList.stream()
				.collect(Collectors.groupingBy(emp->emp.getDateOfJoining().getYear(),Collectors.counting()));
				System.out.println(emps3);
				
				//display year in which max employee joined
				int year=emps3.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.map(entry->entry.getKey())
				.orElse(0);
				System.out.println(year);
		
	}

}
//int					primitive int 
//Integer       		Wrapper class
//Optional<String>							-------     +  -  *	
//OptionalInt								-------+


/*
---------
|       |     <---    box  this is optional
|       |
---------

---------
|       |     <---    box  this is optional
|"Rahul"|
---------    .get()

Optional value or it will be empty

*/
