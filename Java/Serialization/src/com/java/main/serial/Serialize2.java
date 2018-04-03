package com.java.main.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize2 {
	public static void main(String[] args) {
		Persons p = new Persons();
		p.setAge(22);
		p.setName("Manish");
		p.setSalary(3333);
		try(FileOutputStream fileOut = new FileOutputStream("mnnn.txt")) {
			
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(p);
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		System.out.println("done");
	}
}