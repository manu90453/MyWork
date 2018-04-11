package com.java.main.objective.ques;

public class BreskStatement {
	
	public static void main(String[] args) {
		int count = 0;
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				for(int k=0;k<3; k++) {
					count++;
					if(k>j) 
						break;
				}
			}
		}
		System.out.println(count);
	}

}
