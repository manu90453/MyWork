package com.main.java;
import java.io.*;

class Building {  
   void color() throws Exception
   {
       System.out.println("Blue");
   }  
}
class Room extends Building{
    void color() throws IOException
    {
        System.out.println("White");
    }  
    public static void main(String args[]){  
        Building obj = new Room();  
        try{
	   obj.color();
	}catch(Exception e){
	   System.out.println(e);
	 }
    } 
}
