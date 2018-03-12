package com.main.java.games;

import java.util.Scanner;

/*
 * Monk and !Monk decided to play a simple number game. Each of them had a set of numbers (may contain a number more than once) to play with. Lets denote by 
A[] the set belonging to Monk, and by B[], the set belonging to !Monk.

They defined three functions f(x), g(x) and V(x) :
f(x) : Returns count of numbers strictly smaller than x in opponent's set
g(x) : Returns count of numbers strictly greater than x in opponent's set
V(x) : f(x) × g(x)

Score of a player is defined to be the 
∑V(x) for each element 
x present in the players set.

The player with higher score wins the game.

Input: 
The first line contains two positive integers N and M where N and M represent the number of elements present in Monk and !Monk's sets respectively.
The second line contains N space separated integers - elements present in Monk's set
The third line contains M space separated integers - elements present in !Monk's set
Output:

If Monk wins, print "Monk" (without quotes) followed by a space and the score difference between him and !Monk
If !Monk wins, print "!Monk" (without quotes) followed by a space and the score difference between him and Monk
If both players have equal scores, then print "Tie" (without quotes).

 */
public class SimpleGames {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of element for Monk");
		int M = scan.nextInt();
		System.out.println("Number of element for !Monk");
		int N = scan.nextInt();
		
		int arrMonk1[] = new int[M];
		int arrMonk2[] = new int[N];
		if (M <= 0 || N <= 0) {
			System.out.println("Error, invalid input ...");
			return;
		}
		System.out.println("Enter Elements Monk");
		for(int i=0; i<M; i++) {
			arrMonk1[i] = scan.nextInt();
		}
		System.out.println("Enter Elements Monk");
		for(int i=0; i<N; i++) {
			arrMonk2[i] = scan.nextInt();
		}
		
		int resultOfMonk1 = summation(arrMonk1, M, arrMonk2, N); 
		int resultOfMonk2 = summation(arrMonk2, N, arrMonk1, M);
		System.out.println("resultOfMonk1 = " + resultOfMonk1);
		System.out.println("resultOfMonk2 = " + resultOfMonk2);
		
		if(resultOfMonk1 > resultOfMonk2)
			System.out.println("Monk Winner " + (resultOfMonk1-resultOfMonk2));
		else if(resultOfMonk1 < resultOfMonk2)
			System.out.println("!Monk Winner " + (resultOfMonk2-resultOfMonk1));
		else
			System.out.println("Tie");
	} // main
	
	public static int summation(int arrMonk1[], int M, int arrMonk2[], int N) {
		int result = 0;
		for (int i=0; i<M; i++) {
			result += (f(arrMonk1[i],arrMonk2,N) * g(arrMonk1[i],arrMonk2,N));
		}
		return result;	
	} //summation
	
	public static int f(int x, int arr[], int size) {
		int res = 0;
		for(int i=0; i < size; i++){
			if (x > arr[i])
				++res;
		}
		return res;
	} //f()
	
	public static int g(int x, int arr[], int size) {
		int res = 0;
		for(int i=0; i < size; i++){
			if (x < arr[i])
				++res;
		}
		return res;
	} //g()
}
