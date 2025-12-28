

import java.util.Scanner;


public class TestBoxFunctionality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Box dims: width depth height");
        Box b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter 2nd Box dims: width depth height");
        Box b2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println(b1.checkEquality(b2) ? "Same" : "Different");
    }
}
