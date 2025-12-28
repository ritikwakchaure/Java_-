package com.app.core;

public class Box {

    private double width;
    private double depth;
    private double height;

    // default constructor
    public Box() {
        this.width = 1;
        this.depth = 1;
        this.height = 1;
    }

    // cube constructor
    public Box(double side) {
        this.width = side;
        this.depth = side;
        this.height = side;
    }

    // parameterized constructor
    public Box(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    // get dimensions
    public String getBoxDimensions() {
        return "Width=" + width + ", Depth=" + depth + ", Height=" + height;
    }
    public double getBoxVolume() {

        return width * depth * height;
    }


    // check equality
    public boolean checkEquality(Box anotherBox) {
        return this.width == anotherBox.width
                && this.depth == anotherBox.depth
                && this.height == anotherBox.height;
    }

    // create new box using offsets
    public Box createNewBox(double wOffset, double dOffset, double hOffset) {
        return new Box(
                this.width + wOffset,
                this.depth + dOffset,
                this.height + hOffset
        );
    }
}
