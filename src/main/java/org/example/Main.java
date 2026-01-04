package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate how many years until they turn 100
        int yearsLeft = AgeCalculator.yearsUntil100(age);

        // Print message
        System.out.println("You have " + yearsLeft + " years until you are 100 years old!");

        // Close scanner
        scanner.close();
    }
}
