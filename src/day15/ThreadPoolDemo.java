package day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
public static void main(String[] args) {
	
	ExecutorService executor =Executors.newFixedThreadPool(3);   //3 thread will be made upfront
	
	executor.submit(new Alpha());
	executor.submit(new Beta());
	executor.submit(new Gama());
	
	executor.shutdown();
}
}
