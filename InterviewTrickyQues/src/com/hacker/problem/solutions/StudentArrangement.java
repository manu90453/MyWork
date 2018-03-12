package com.main.java;



public class StudentArrangement {
	public static void main(String[] args) {
		
	}
	
	
	public void initializeClassArray(int classArray[][], int noOfRows, int noOfColumn) {
		for(int i=1; i<=noOfRows; i++) 
			for(int j=1; j<=noOfColumn; j++) 
				classArray[i][j] = 0;
	}
	public boolean studentAllocation(int classArray[][], int noOfRows, int noOfColumn, int studentPreference) {
		boolean flag = false;
		if (studentPreference > 0 && noOfRows <= studentPreference)	
			for (int j=1; j<noOfColumn; j++) {
				if (classArray[studentPreference][j] == 0) {
					classArray[studentPreference][j] = 1;
					flag = true;
				}
			}
		return flag;				
	}			
}			
		
	

