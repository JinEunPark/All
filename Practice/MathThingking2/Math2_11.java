package MathThingking2;

import java.util.Scanner;

public class Math2_11 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();

        double g_circle = n * n * Math.PI;
        double y_circle = 2 * n * n;

        System.out.println(String.format("%.6f", g_circle));
        System.out.print(String.format("%.6f", y_circle));
    }
}
