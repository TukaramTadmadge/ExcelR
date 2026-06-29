package day13;

public class GarbageCollectionDemo {

	public static void main(String[] args) {
		String str="Alice";					// 					alice(X)       Ben
											//				    1000			str-> 2000
		
		str="Ben";
	}

}


// 2 phases of Garbage collector

//1. Mark
//2. Sweep

//Java is automatic garbage collected lang
// as a prog to allocate memory, deallocation of memory by gc JVM activity