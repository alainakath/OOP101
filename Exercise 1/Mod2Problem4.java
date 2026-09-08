/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alaina
 */
//Alaina Katherine S. Rocreo_TA21
import java.util.Scanner;
public class Mod2Problem4 {
    public static void main(String[] args) {
        
        // Scanner is used to get input from the user.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter guest name: ");
        String guestName = input.nextLine();

        System.out.print("Enter room number: ");
        int roomNumber = input.nextInt();

        System.out.print("Enter number of nights: ");
        int nights = input.nextInt();

        System.out.print("Enter room rate: ");
        double roomRate = input.nextDouble();

        System.out.println("\n--- Hotel Guest Record ---");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Number of Nights: " + nights);
        System.out.println("Room Rate: " + roomRate);
        System.out.println("Alaina Katherine S. Rocreo");
    }
}
    
   
