/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alaina
 */
//Alaina Katherine S. Rocreo TA21
import java.util.Scanner;
public class Mod2Problem5 {
    public static void main(String[] args) {

        // Scanner is used to get input from the user.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter smartphone brand: ");
        String brand = input.nextLine();

        System.out.print("Enter smartphone model: ");
        String model = input.nextLine();

        System.out.print("Enter RAM capacity in GB: ");
        int ram = input.nextInt();

        System.out.print("Enter storage capacity in GB: ");
        int storage = input.nextInt();

        System.out.print("Enter price: ");
        double price = input.nextDouble();

        System.out.println("\n--- Smartphone Specification Record ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: " + price);
        System.out.println("Alaina Katherine S. Rocreo");
    }
}