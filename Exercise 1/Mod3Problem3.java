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
public class Mod3Problem3 {
    public static void main(String[] args) {

        // Scanner is used to get input from the user.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Alaina Katherine S. Rocreo");
    }
}