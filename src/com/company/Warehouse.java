package com.company;

import java.util.Arrays;

public class Warehouse {
    Box[] boxes;
    int count;

    public Warehouse(int length) {
     this.boxes = new Box[length];
    }

    public void boxAdd(Box box){
        for (int i = 0; i < boxes.length; i++){

            if (boxes[i]==null) {
                boxes[i] = box;
                break;
            } else if (count > boxes.length){
                throw new warehouseIsFullException("Warehouse is full");
            }

        } count++;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "boxes=" + Arrays.toString(boxes) +
                '}';
    }
}
