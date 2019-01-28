package QATraining;

public class ConstructorOverload {
	
	public ConstructorOverload(String a) {
		System.out.println("this is my code" + " "  +a);
	}
	
	public ConstructorOverload (String a, String b) {
		System.out.println("this is my second code");
		System.out.println(" this is my third code");
		
	}

	public static void main(String[] args) {
		
		ConstructorOverload obj = new ConstructorOverload("mehedi");
		
	}
}
