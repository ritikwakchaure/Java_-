package primitive_array;

import java.util.Scanner;

public class  Test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Kitne samples lene hain
        System.out.print("Enter number of samples: ");
        int n = sc.nextInt();

        // 2. Suitable array create karo (double)
        double[] data = new double[n];

        // 3. Pehle default values dikhao (optional)
        System.out.println("\nDefault values in array:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("data[" + i + "] = " + data[i]);
        }

        // 4. User se data lo aur array me store karo
        System.out.println("\nEnter " + n + " double values:");
        for (int i = 0; i < data.length; i++) {
            data[i] = sc.nextDouble();
        }

        // 5. Normal for loop se display
        System.out.println("\nArray elements using for loop:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("data[" + i + "] = " + data[i]);
        }

        // 6. Enhanced for‑each loop se display
        System.out.println("\nArray elements using for-each loop:");
        for (double val : data) {
            System.out.println(val);
        }

        sc.close();
    }
}

