package com.masai;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char iput = 65;
		if(iput == 'a' || iput == 'e' || iput == 'i' || iput == 'o' || iput == 'u' ||
		   iput == 'A' || iput == 'E' || iput == 'I' || iput == 'O' || iput == 'U') {
			System.out.println( iput +" is vowel" );
		}
		else {
			System.out.println(iput + " is consonant");
		}
	}

}
