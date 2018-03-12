package com.implement.ds.heap;

public class MaxHeap {
	
	int[] defaultElementData = new int[0];
	int[] maxElement ;
	int size;
	int i;
	
	public MaxHeap() {
		maxElement = defaultElementData;
	}
	
	public void insert(int data) {
		ensureArrSize(maxElement, size+1);
		System.out.println(data);
		maxElement[i++] = data;
		maximum(maxElement);
		size++;
	}
	
	public void maximum(int[] arr) {
		if(arr.length == 1) {
			return;
		}
		
		int temp = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if(temp < arr[i])
				temp = arr[i];
		}
	}
	
	public void ensureArrSize(int[] array, int size) {
		if(array == defaultElementData) {
			maxElement = new int[2];
		}
		
		if(array.length == size) {
			maxElement = new int[array.length+10];
			//System.out.println("array size" + maxElement.length);
		}
	}

}
