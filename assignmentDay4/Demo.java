package assignmentDay4;

//Question 2

public class Demo {

	public Demo() {
		System.out.println("In the part of Demo()");
	}
	
	public Demo(String s) {
		System.out.println("In the part of Demo(String s)");
	}
	
	public Demo(int i) {
		System.out.println("In the part of Demo(int i)");
	}
	
	public Demo(float f) {
		System.out.println("In the part of Demo(float f)");
	}
	
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Demo d = new Demo("yes");
		
	}

}
