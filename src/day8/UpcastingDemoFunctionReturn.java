package day8;

import day10.Student;

public class UpcastingDemoFunctionReturn {

	public static void main(String[] args) {
		BengalTiger bt=new BengalTiger();
		best(bt);

	}

	private static void best(Animal bt) {
		
		
	}

	public Object test() {
		return new BengalTiger();
	}

}
