package javaprogrammes_week2_vishal;

import java.util.Scanner;

/*
Write a Java program that takes three number as input to calculate and
print the average of the numbers
 */
public class Programme_13_AverageOfNumbers {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        double x = scanner.nextDouble();
        System.out.println("Enter the Second Number : ");
        double y = scanner.nextDouble();
        System.out.println("Enter the Third Number : ");
        double z = scanner.nextDouble();
        averageOfThreeNumbers(x, y, z);
        scanner.close();
    }

    // Calculation the average of three numbers
    public static void averageOfThreeNumbers(double x, double y, double z) {
        double average = (x + y + z) / 3;
        System.out.println("The average of " + x + " , " + y + " and " + z + " is : " + average);
    }
}
