package QATraining;

public class Test {

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();  // compile time polymorphism or static polymorphism
		obj.Honesty();
		obj.Smile();
		obj.Kind();
		
		System.out.println("*****************************");
		
		ParentClass obj1 = new ChildClass();  //up casting/Top Casting ---Runtime Polymorphism or Dynamic Polymorphism
		obj1.Honesty();
		obj.Smile();
		obj1.Kind();
		

	}

}
