package com.masai;

public class PrimeFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 99;
		if(num>=2 && num<=100) {
			for(int i=1;i<101;i++) {
				if(num%i==0) System.out.println(i);
			}
		}
		else System.out.println("Invalid Number");
	}

}
