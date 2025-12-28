package com.app.tester;

import com.app.core.Box;

import java.util.Scanner;

public class TestBoxArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many boxes?");

        // boxes : local reference variable (stored on stack)
        // new Box[n] : array object created in heap
        // each element can store reference of Box object
        // all elements are initialized to null
        Box[] boxes = new Box[sc.nextInt()];

        // prints runtime class name of array
        System.out.println("Name of the Box[] class : " + boxes.getClass());

        System.out.println("Default array contents:");

        // enhanced for-loop to show default values
        for (Box box : boxes) {
            System.out.println(box); // prints null
        }
        for (int i = 0; i < boxes.length; i++) {
            System.out.println("Enter box DIms -w d h");
            boxes[i] = new Box(sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble()
            );
        }
        for (Box box : boxes) {
            System.out.println(box.getBoxDimensions());
            System.out.println("Volume " + box.getBoxVolume());
        }

        sc.close();
    }
}
