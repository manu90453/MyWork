package com.ques;

public class PackageProblem {
	public static void main(String[] args) {
		double limit = 75;
		double[] wieght = new double[] {50.8, 88.6, 72.3, 30.8, 46.9};
		int[] price = new int[] {45, 98, 3, 76, 9, 34, 48};
		int index=1;
		
		//remove thing that having weight more than limit
		double tempWeight = 0;
		int tempPrice= 0;
		while(true) {
			limit = limit - tempWeight;
			for(int i=1; i<wieght.length-1; i++) {
				if(price[i] > tempPrice) {
					if(wieght[i]<=limit) {
						tempWeight = wieght[i];
						tempPrice = price[i];
						index = i;
					}
				}
			}
			System.out.println(index);
		}
		
		
		

	}

}
