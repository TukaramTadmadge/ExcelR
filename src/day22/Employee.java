package day22;

import java.time.LocalDate;

public class Employee {
	private int eno;
	LocalDate dateOfJoining,dateOfBirth;
	private String ename,gender,department;
	private double salary;
	
	public Employee() {}
	public Employee(int eno, LocalDate dateOfJoining, LocalDate dateOfBirth, String ename, String gender,
			String department, double salary) {
		this.eno = eno;
		this.dateOfJoining = dateOfJoining;
		this.dateOfBirth = dateOfBirth;
		this.ename = ename;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", dateOfJoining=" + dateOfJoining + ", dateOfBirth="
				+ dateOfBirth + ", ename=" + ename + ", gender=" + gender + ", department=" + department + ", salary="
				+ salary + "]";
	}
	
	
}
