package com.main.java.general;

interface IFruit
{
    public String TYPE = "Apple";
}

class Fruit implements IFruit
{

}

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello ....");
        System.out.println(Fruit.TYPE);
    }
}
