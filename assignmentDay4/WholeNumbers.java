package assignmentDay4;

public class WholeNumbers {
	
	void number(int x) {
		if(x>0) {
			if(x%2==1) {
				System.out.println(x);
			}
			else {
				System.out.println((10-(x%10))+x);
			}
		}
		else {
			System.out.println(x+" "+"Error");
		}
	}
	
	public static void main(String[] args) {
		WholeNumbers n1 = new WholeNumbers();
		n1.number(50);
	}

}
