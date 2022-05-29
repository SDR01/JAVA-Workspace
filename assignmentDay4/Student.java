package assignmentDay4;

public class Student {

	private int roll;
	private String name;
	private String address;
	private String collegeName;
	
	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", collegeName=" + collegeName
				+ "]";
	}

	public Student(int roll, String name, String address) {
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	
	public Student(int roll, String name, String address, String collegeName) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = collegeName;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	public static boolean getStudent(boolean isFromNIT) {
		return isFromNIT;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s2 = new Student(10, "karthik", "pune", "nit");
			if(s2.collegeName == "nit") {
				getStudent(true);
				System.out.println(s2);
			}
			else {
				System.out.println(s2);
			}
	}

}
