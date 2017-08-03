package com.overridde.overload;

interface ByteChannel {
	default int getAge() {
		return 23;
	}
}
interface ReadChannel extends ByteChannel {
	default public String printName() {
		return "Sharma Manish";
	}
}

interface WriteChannel extends ByteChannel {
	default public String printName() {
		return "Manish Sharma";
	}
}

public class DiamondProblem implements ReadChannel, WriteChannel {
	
	int i;
	
	public void name(){
		
	}
	public static void main(String[] args) {
		//i=0;
		//name()
		System.out.println(new DiamondProblem().printName());
	}
	
	@Override
	public String printName() {
		// TODO Auto-generated method stub
		return WriteChannel.super.printName();
	}
}
