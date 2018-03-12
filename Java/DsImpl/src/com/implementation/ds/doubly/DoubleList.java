package com.implementation.ds.doubly;

import java.util.Scanner;

import com.implement.ds.list.single.SingleLinkedList;

public class DoubleList {
	public static void main(String[] args) {
		int option = 0;
		int data = 0;
		int pos = 0;
		String op = null;
		String operation;
		DoubleLinkList sl = new DoubleLinkList();

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter add/delete option: ");
			operation = sc.next();

			if ("add".equalsIgnoreCase(operation)) {
				System.out.println("Enter insert option, 1:AddStart, 2:AddEnd, 3:AddPos");
				option = sc.nextInt();
				if (option == 1 || option == 2) {
					System.out.println("Enter data");
					data = sc.nextInt();
				} else if(option == 3){
					System.out.println("Enter data and ");
					data = sc.nextInt();
					System.out.println("Enter position");
					pos = sc.nextInt();
				}
			} else if ("delete".equalsIgnoreCase(operation)) {
				System.out.println("Enter position");
				pos = sc.nextInt();
			}
			switch (operation) {
			case "add": {	
				if(option == 1)
					sl.addAtStart(data);
				else if(option == 2)
					sl.addAtLast(data);
				else if(option == 3)
					sl.addAtPos(data, pos);
				else {
					System.out.println("enrtr valid insert option");
					continue;
				}	
			}
			case "delete": {
				System.out.println("tt" + sl.getSize());
				sl.delete(pos);
				System.out.println("55" + sl.getSize());
			}
			default:
				break;
			}
			System.out.println("Do u want to add/delete");
			op = sc.next();

		} while (op.equalsIgnoreCase("yes"));

		sc.close();

		sl.display();
		sl.displayFromLast();
	
		
	}

}
