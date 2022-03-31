package com.company;

public class Box {

    double length;
    double width;
    double height;

    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double volume() {
        return (length * width * height);
    }
}
