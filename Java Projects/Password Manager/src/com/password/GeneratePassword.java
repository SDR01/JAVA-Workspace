package com.password;

import java.util.Scanner;

public class GeneratePassword {
	
	public static String insertRandom(String s1, String s2) {
		int n = s1.length();
		int r = (int) ((n-1) * Math.random());
		return s1.substring(0,r) + s2 + s1.substring(r);
		
	}
	
	public static String getRandomChar(String s) {
		int n = s.length();
		int r = (int) (n * Math.random());
		return s.substring(r,r+1);
	}
	
	public static String generatingPassword(int length) {
		
		String result = "";
		
		for(int i=0; i<length; i++) {
			String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String lowerCase = "abcdefghijklmnopqrstuvwxyz";
			result += getRandomChar(upperCase+lowerCase);
		}
		
		for(int i=0; i<length/3; i++) {
			String numbers = "0123456789";
			String splChar = "!@#$%^&*()_+[]:<>?/|";
			result += insertRandom(result,numbers);
			result += insertRandom(result,splChar);
		}
		
		return result.substring(0,length);
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("-------------- Welcome to Password Generator --------------");
		System.out.println(" ");
		
		
		
		
		while(true) {
			System.out.println(" ");
			System.out.println("1. Generate Password");
			System.out.println("2. Exit Application");
			System.out.println(" ");
			System.out.println("Select the option 1 or 2");
			int num = 0;
			try {
				num = input.nextInt();
			} catch (Exception e) {
				System.out.println("Enter an integer value");
				break;
			}
			if(num == 1) {
				System.out.println("Enter required Password Length(8-20): ");
				int length = input.nextInt();
				
				if(length <= 20 && length >= 8) {
					String password = generatingPassword(length);
					System.out.println("Password is : " + password);
				}
				else {
					System.out.println("Please Enter Password Length between 8 and 20 only");
				}
			}
			if(num == 2) {
				System.out.println("Thank you for using our application");
				break;
			}
			if(num != 1 && num != 2) {
				System.out.println("Wrong Choice, Please select 1 or 2 only");
			}
		}
		
	}

}
