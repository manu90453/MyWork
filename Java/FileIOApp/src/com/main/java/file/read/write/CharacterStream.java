package com.main.java.file.read.write;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStream {
	
	public static void main(String[] args) {
		
		FileReader reader = null;
		FileWriter writer = null;
		try {
			reader = new FileReader("abc.txt");
			writer = new FileWriter("Write1.txt");
			int ch = 0;
			while((ch = reader.read()) != -1) {
				System.out.println((char)ch);
				writer.write(ch);
				writer.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
