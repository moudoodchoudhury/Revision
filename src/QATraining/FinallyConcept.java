package QATraining;

public class FinallyConcept {
	
	// finally is a block, finally{   }

	public static void main(String[] args) {
		
		//test1();
		division();
		
		
	}

	public static void test1() {
	try {
		System.out.println("This is my test1 method");
		throw new RuntimeException ("test");
		
	}catch (Exception e) {
		System.out.println("This inside catch block");
	}finally {
		System.out.println("This is finally block ");
	}
}
	
	public static void division() {
		
		int i = 20;
		
		try {
		System.out.println("This is MY division method");
		int j = i/0;
		}catch(Exception e ) {
		System.out.println("This is divided method");
		}finally{
		System.out.println("This is my last coding");
		}
	}
}
