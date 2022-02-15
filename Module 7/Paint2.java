/*
Author: Travis Barbur
Course: IT-145 - X3993
Date: 02/15/2022
 */

import java.util.Scanner;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        do {
            // Prompt user to input wall's height
            System.out.println("Enter wall height (feet): ");
            if (!scnr.hasNextDouble()) {
                scnr.next();
                continue;
            }

            wallHeight = scnr.nextDouble();
            // No paint needed and continue on until break
            if (!(wallHeight > 0))
                continue;
            //Stops the loop
            break;
        } while(true);
        // User prompt to enter the wall width
        do {

            // Prompt user to input wall's width
            System.out.println("Enter wall width (feet): ");

            if (!scnr.hasNextDouble()) {
                scnr.next();

                // Move to the next input
                continue;
            }
            wallWidth = scnr.nextDouble();

            // No paint needed and continue on until break
            if (!(wallWidth > 0))
                continue;

            //Stops the loop
            break;
        } while(true);


            // Calculate and output wall area
            wallArea = wallHeight * wallWidth * gallonsPerCan;

            // Calculate and output the amount of paint in gallons needed to paint the wall
            gallonsPaintNeeded = wallArea / squareFeetPerGallons;
            System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

            // Round gallonsPaintNeeded up as the number of cans needed
            cansNeeded = Math.ceil(gallonsPerCan);
            System.out.println("Cans needed: " + cansNeeded + " can(s)");

            // Calculate and output the number of paint cans needed to paint the wall,
            // rounded up to the nearest integer
            // Complete this code block
        }
    }


