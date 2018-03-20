package com.main.java.file.read.write;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("abc.txt");
			fw.write("I am manish");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileReader fr=  null;
		try {
			fr = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println((char)fr.read());
		} catch (Exception e) {
		}
		
	}

}
