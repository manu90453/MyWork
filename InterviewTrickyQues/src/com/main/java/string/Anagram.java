package com.main.java.string;

public class Anagram {
	private char[] deepCopy(char[] pat) {
		char[] temp = new char[pat.length];
		for(int i=0; i<pat.length; i++)
			temp[i] = pat[i];
		return temp;
	}
	
	private char[] remove(char[] temp, int index) {
		if (index>=temp.length) {
			System.out.println("Invalid index");
			return temp;
		}
		char[] refTemp = new char[temp.length];
		for (int i=0; i<temp.length-1; i++){
			for(int j=0; j<index; j++) {
				refTemp[i] = temp[i];
			}
			refTemp[i] = temp[i+1];
		}
		return refTemp;
	}
	private int findAnagram(char[] txt, char[] pat){
		char []temp = deepCopy(pat);
		int anagramCount = 0, tempCount = 0;
		for (int i=0; i<pat.length; i++) 
			temp[i] = pat[i];
		
		for(int i=0; i<txt.length; i++) {
			tempCount = 0;
			int j = 0;
			int len = temp.length;
			while(j<len) {
				if(txt[i] == temp[j]) {
					temp=remove(temp, j);
					System.out.println(temp);
					tempCount++;
					len--;
					//j = 0;
				} 
				j++;		
			}
			if (tempCount == pat.length) {
				anagramCount ++;
			}
			temp = deepCopy(pat);
		}
		System.out.println("No of Anagram found = " + anagramCount);
		return anagramCount;
	}
	
	public int checkAnagram(char[] word, char[] pat){
		int anagramCount = 0;
		StringBuilder sbPat = new StringBuilder(pat.toString());
		for (char ch: word) {
			int index = sbPat.indexOf(""+ch);
			if (index != -1) {
				sbPat.deleteCharAt(index);
			} else {
				return -1;
			}
		}
		return anagramCount;
	}
	
	public static void main(String[] args) {
		Anagram ob = new Anagram();
		char[] txt = {'a','b','d','c','g','d','c','a','b','a','b','c','d','f'};
		char[] pat = {'a','b','c','d'};
		ob.findAnagram(txt, pat);
	}

}
