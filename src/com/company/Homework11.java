package com.company;

public class Homework11 {

    public static void main(String[] args) {
	Box box1 = new Box(10,10,10);
    Box box2 = new Box(20,30,40);
    Box box3 = new Box(30,40,50);
    Box box4 = new Box(40,50,60);
    Box box5 = new Box(50,60,70);
        System.out.println("Объём коробки 1 = " + box1.volume());
        System.out.println("Объём коробки 2 = " + box2.volume());
        System.out.println("Объём коробки 3 = " + box3.volume());
        System.out.println("Объём коробки 4 = " + box4.volume());
        System.out.println("Объём коробки 5 = " + box5.volume());
    }
}