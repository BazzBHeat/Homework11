package com.company;

public class Homework11 {

    public static void main(String[] args) {
        Material m = Material.Plastic;
        Colour c = Colour.Green;
        try{
            Box box1 = new Box(10,-10,10);
        }
         catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    Box box2 = new Box(20,30,40);
    Box box3 = new Box(30,40,50);
    Box box4 = new Box(40,50,60);
    Box box5 = new Box(50,60,70);
    Box box6 = new Box(1,1,1,"Steel");
    ColourBox box7 = new ColourBox(1,1,1, c.name(), m.name());

//        System.out.println("Объём коробки 1 = " + box1.volume());
        System.out.println("Объём коробки 2 = " + box2.volume());
        System.out.println("Объём коробки 3 = " + box3.volume());
        System.out.println("Объём коробки 4 = " + box4.volume());
        System.out.println("Объём коробки 5 = " + box5.volume());
        System.out.println("This box is " + box7.getColour() + " and made of " + box7.getMaterial());

//        System.out.println(box1.toString());
        System.out.println(box6.toString());
        System.out.println(box7.toString());


        Warehouse warehouse = new Warehouse(2);
       try {
//           warehouse.boxAdd(box1);
           warehouse.boxAdd(box6);
           warehouse.boxAdd(box7);
           warehouse.boxAdd(box5);
           warehouse.boxAdd(box4);
       } catch (warehouseIsFullException e) {
           System.out.println(e.getMessage());
       };
        System.out.println(warehouse.toString());
    }
}
