package com.app.tester;

import java.util.Scanner;

import com.app.core.Box;

class TestBoxFunctionality {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // cube
        System.out.println("Enter side of a cube");
        Box cube = new Box(sc.nextDouble());
        System.out.println("Cube " + cube.getBoxDimensions());

        // default box
        Box defaultBox = new Box();
        System.out.println("Def inited Box " + defaultBox.getBoxDimensions());

        // first box
        System.out.println("Enter 1st box dims : w d h");
        Box b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        // second box
        System.out.println("Enter 2nd box dims : w d h");
        Box b2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println(
                b1.checkEquality(b2) ? "Same" : "Different"
        );

        // offset box
        System.out.println(
                "Enter the offsets from the 1st box dims : width-offset depth-offset height-offset"
        );

        Box b3 = b1.createNewBox(
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble()
        );

        System.out.println("New box dims " + b3.getBoxDimensions());

        sc.close();
    }
}
