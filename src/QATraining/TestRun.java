package QATraining;

public class TestRun {

	public static void main(String[] args) {
		PolymorphismPractice1 obj = new PolymorphismPractice1();
		obj.bowler();
		obj.run();
		obj.run1();
		
		System.out.println("--------------------");
		PolymorphismPractice obj1 = new PolymorphismPractice1();  //up/top casting or dynamic polymorphism/runtime
		obj1.run();
		obj1.run1();

		

	}

}
