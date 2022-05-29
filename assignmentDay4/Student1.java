package assignmentDay4;

//Question 1


public class Student1 {
	
	private int roll;
	private String name;
	private int age;
	private int marks;

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	public Student1(){
		
	}
	
	public Student1(int roll, String name, int age, int marks) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public int getRoll() {
		return roll;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	
	public void setAge(int age) {
		if(age>18 && age<60) {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}


	public void setMarks(int marks) {
		if(marks>0 && marks<500) {
			this.marks = marks;
		}
	}
	
	public int getMarks() {
		return marks;
	}
	


}

class Separate{
	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		s1.setRoll(01);
		s1.setName("Alpha");
		s1.setAge(22);
		s1.setMarks(444);
		System.out.println("Roll No is "+s1.getRoll());
		System.out.println("Name is "+s1.getName());
		System.out.println("Age is "+s1.getAge());
		System.out.println("Marks are "+s1.getMarks());
		
		System.out.println("----------------------------");
		
		Student1 s2 = new Student1(4, "Delta", 21, 555);
		System.out.println(s2);
//		System.out.println("Roll No is "+s2.getRoll());
//		System.out.println("Name is "+s2.getName());
//		System.out.println("Age is "+s2.getAge());
//		System.out.println("Marks are "+s2.getMarks());
	}
}
