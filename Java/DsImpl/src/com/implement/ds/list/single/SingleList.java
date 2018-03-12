package com.implement.ds.list.single;

import java.util.Scanner;

public class SingleList {
	public static void main(String[] args) {

		int option = 0;
		int data = 0;
		int pos = 0;
		String op = null;
		String operation;

		SingleLinkedList sl = new SingleLinkedList();

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
				} else {
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
				System.out.println(sl.size());
				sl.delete(pos);
			}
			default:
				break;
			}
			System.out.println("Do u want to add/delete");
			op = sc.next();

		} while (op.equalsIgnoreCase("yes"));

		sc.close();

		sl.printList();
	}

}
