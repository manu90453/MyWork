package com.main.java.string;

public class DemitifySubStrings {
    static void combinationUtil(char arr[], char data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }
 
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }
 
    
    static void printCombination(char arr[], int n, int r)
    {
        char data[]=new char[r];
        combinationUtil(arr, data, 0, n-1, 0, r);
    }
	public static void main(String[] args) {
		 char arr[] = {'b', 'c', 'a'};
	        int r = 2;
	        int n = arr.length;
	        printCombination(arr, n, r);
	}

}
