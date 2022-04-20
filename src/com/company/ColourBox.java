package com.company;

public class ColourBox extends Box{
    private String colour;

    public ColourBox(double length, double width, double height, String colour, String material) {
        super(length, width, height, material);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();

        result.append(super.toString()).append(", colour = ").append(colour);
        return result.toString();
   }


    }

