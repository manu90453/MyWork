package com.main.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class FormattingInoutForHE {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static FastScanner fs = new FastScanner(br);
    static PrintWriter pr = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
		
	    int testCase = fs.nextInt(), length = fs.nextInt();
	    System.out.println("Hello World " + testCase);
	    pr.println("Testcase = " + testCase);
	    pr.println("Length = " + length);
	    
	    pr.close();
	}
}


class FastScanner
{
    BufferedReader in;
    StringTokenizer st;
    public FastScanner(BufferedReader in) {
        this.in = in;
    }
	
    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
	
	public String next() throws Exception {
		return nextToken().toString();
	}
	
    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}