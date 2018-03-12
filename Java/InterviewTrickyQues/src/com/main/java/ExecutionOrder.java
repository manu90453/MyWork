package com.main.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExecutionOrder {
	/*static {
		System.out.println(" Static Block executed ...");
	}
	
	public ExecutionOrder() {
		System.out.println(" no-arg Constructor executed ...");
	}
	
	{
		System.out.println(" Instance block execited ...");
	}*/
	
		 public static void main(String args[] ) throws Exception {
		        /*
		         * Read input from stdin and provide input before running
		         * Use either of these methods for input
		        */
		        //BufferedReader
			 	/*System.out.println("Testcase No");
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        String line = br.readLine();
		        
		        int T = Integer.parseInt(line);
		        
		        //Scanner
		        @SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
		        //int T = s.nextInt();
		        long x, k, m;
		        long temp, power;
		        long arr[] = new long[T];
		        for (int i=0; i<T; i++) {
		        	System.out.println("Enter Values ");
		            x = s.nextLong();
		            System.out.println("Enter k = ");
		            k = s.nextLong();
		            System.out.println("Enter m = ");
		            m = s.nextLong();
		        	line = br.readLine();
		            x = Long.parseLong(line);
		            line = br.readLine();
		            k = Long.parseLong(line);
		            line = br.readLine();
		            m = Long.parseLong(line);
		            temp = 1;
		            power = 1;
		            for(int l=0; l<k; l++) {
		            	power = power * x;
		            }
		            for (int j=0; j<power; j++) {
		            	arr[i] = (temp * x) % m;
		            }
		        }
		        for (int i=0; i<T; i++) {
		            System.out.println(arr[i]);
		        }*/
			 //Scanner in = new Scanner(System.in);
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        String line = br.readLine();
		        //int t = in.nextInt();
		        int t = Integer.parseInt(line);
		        int num, copy;
		        int count[] = new int[t];
		        int reminder;
		        for(int j=0; j<t; j++) {
		            count[j] = 0;
		        }
		        for (int i=0; i<t; i++){
		            //in = new Scanner(System.in);
		            //num = in.nextInt();
		            line = br.readLine();
		            num = Integer.parseInt(line);
		            copy = num;
		            while (copy > 0) {
		                reminder = copy % 10;
		                if (reminder>0 && num%reminder == 0) {
		                    count[i]++;
		                }
		                copy = copy/10;
		            }
		        } 
		        for(int k=0; k<t; k++) {
		            System.out.println(count[k]);
		        }
		    }//main	
}
