package com.company;

public class Box {

    private double length;
    private double width;
    private double height;
    private String material = "default";

  public   Box(double length, double width, double height){
      if (length <= 0 || width <= 0 || height <= 0){
          throw new IllegalArgumentException("Неправильный размер коробки");
      }
        this.length = length;
        this.width = width;
        this.height = height;
    }

   public Box(double length, double width, double height, String material){
        this(length, width, height);
        this.material = material;

    }


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }



    public String getMaterial() {
        return material;
    }

    public void setLength(double length) {
        if(length > 0) {
            this.length = length;
        } else if(length == 0) {
            this.length = 1;
        } else {
                this.length = Math.abs(length);
            }
        }


    public void setWidth(double width) {
        if(width > 0) {
            this.width = width;
        } else if (width == 0){
            this.width = 1;
        }
        else {
            this.width = Math.abs(width);
        }
    }

    public void setHeight(double height) {
        if(height > 0) {
            this.height = height;
        } else if (height == 0) {
            this.height = 1;
        }
            else {
            this.height = Math.abs(height);
        }
    }



    public void setMaterial(String material) {
        this.material = material;
    }

    public double volume() {
        return (length * width * height);
    }

    @Override
    public String toString(){
      StringBuilder result = new StringBuilder();

      result.append("leangth = ").append(length)
              .append(", width= ").append(width)
              .append(", height = ").append(height)
              .append(", material = ").append(material);
    return result.toString();
    }
}
