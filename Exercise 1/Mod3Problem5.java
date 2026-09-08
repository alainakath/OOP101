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

public class Mod3Problem5 {
    public static void main(String[] args) {

        // Scanner is used to get input from the user.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter quiz grade: ");
        double quiz = input.nextDouble();

        System.out.print("Enter project grade: ");
        double project = input.nextDouble();

        System.out.print("Enter examination grade: ");
        double exam = input.nextDouble();

        double finalGrade = (quiz * 0.30) + (project * 0.30) + (exam * 0.40);

        System.out.printf("Final Grade: %.2f%n", finalGrade);
        System.out.println("Alaina Katherine S. Rocreo");
    }
}
