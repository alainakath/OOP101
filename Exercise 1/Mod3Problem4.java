/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alaina
 */
//Alaina Katherine S. Rocreo
import java.util.Scanner;

public class Mod3Problem4 {
    public static void main(String[] args) {

        // Scanner is used to get input from the user.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("BMI: approximately %.10f%n", bmi);
        System.out.println("Alaina Katherine S. Rocreo");
    }
}
