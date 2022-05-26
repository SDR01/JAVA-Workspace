package com.masai;

public class CheckWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isSnowing = false;
		boolean isRaining = false;
		double temperature = 49.0;

		if(isRaining == true || isSnowing == true || temperature < 50.0) {
			System.out.println("Let�s stay home.");
		}
		else {
			System.out.println("Let�s go out!");
		}

	}

}
