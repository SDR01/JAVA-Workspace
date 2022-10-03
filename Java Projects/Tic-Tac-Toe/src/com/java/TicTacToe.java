package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
	
	public static void printBoard(char[][] gameBoard) {
		for(char[] row: gameBoard) {
			for(char c: row) {
				System.out.print(c);
			}
			System.out.println(" ");
		}
	}
	
	public static void placePiece(char[][] gameBoard, int position, String user) {
		
		char Symbol = ' ';
		
		if(user.equals("player")) {
			Symbol = 'X';
			playerPositions.add(position);
		}else if(user.equals("cpu")) {
			Symbol = 'O';
			cpuPositions.add(position);
		}
		
		switch (position) {
			case 1:
				gameBoard[0][0] = Symbol;
				break;
			case 2:
				gameBoard[0][2] = Symbol;
				break;
			case 3:
				gameBoard[0][4] = Symbol;
				break;
			case 4:
				gameBoard[2][0] = Symbol;
				break;
			case 5:
				gameBoard[2][2] = Symbol;
				break;
			case 6:
				gameBoard[2][4] = Symbol;
				break;
			case 7:
				gameBoard[4][0] = Symbol;
				break;
			case 8:
				gameBoard[4][2] = Symbol;
				break;
			case 9:
				gameBoard[4][4] = Symbol;
				break;	
			default:
				System.out.println("Wrong Position");
				break;
		}
		
	}
	
	public static String checkWinner() {
		
		String result = ""; 
		
		List<Integer> topRow = Arrays.asList(1,2,3); 
		List<Integer> midRow = Arrays.asList(4,5,6);
		List<Integer> bottomRow = Arrays.asList(7,8,9);
		List<Integer> leftCol = Arrays.asList(1,4,7);
		List<Integer> centerCol = Arrays.asList(2,5,8);
		List<Integer> rightCol = Arrays.asList(3,6,9);
		List<Integer> lrDiagonal = Arrays.asList(1,5,9);
		List<Integer> rlDiagonal = Arrays.asList(3,5,7);
		
		List<List<Integer>> playing = new ArrayList<>();
		playing.add(topRow);
		playing.add(midRow);
		playing.add(bottomRow);
		playing.add(leftCol);
		playing.add(centerCol);
		playing.add(rightCol);
		playing.add(lrDiagonal);
		playing.add(rlDiagonal);
		
		for(List<Integer> l : playing) {
			if(playerPositions.containsAll(l)) {
				result =  "Congragulations you won!";
			} else if(cpuPositions.containsAll(l)) {
				result = "CPU Won! Better luck next time.";
			} else if(playerPositions.size() + cpuPositions.size() == 9) {
				result = "Tough Competition, try once again.";
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
							  {'-', '+', '-', '+', '-'},
							  {' ', '|', ' ', '|', ' '},
							  {'-', '+', '-', '+', '-'},
							  {' ', '|', ' ', '|', ' '}};
		
		
		
		while(true) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter your placement(1-9): ");
			int playerPosition = scan.nextInt();
			
			while(playerPositions.contains(playerPosition) || cpuPositions.contains(playerPosition)) {
				System.out.println("Position taken! Enter a correct Postion");
				playerPosition = scan.nextInt();
			}
			
			placePiece(gameBoard, playerPosition, "player");
			
			String result = checkWinner();
			if(result.length() > 0) {
				System.out.println(result);
				break;
			}
			
			
			Random randomNum = new Random();
			int cpuPosition = randomNum.nextInt(9) + 1;
			
			while(playerPositions.contains(cpuPosition) || cpuPositions.contains(cpuPosition)) {
				cpuPosition = randomNum.nextInt(9) + 1;
			}
			
			placePiece(gameBoard, cpuPosition, "cpu");
			
			result = checkWinner();
			if(result.length() > 0) {
				System.out.println(result);
				break;
			}
			
			System.out.println("**********");
			System.out.println(" ");
			
			printBoard(gameBoard);
			
			System.out.println(" ");
			System.out.println("**********");
			

			
		}

	}

}
