import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
            System.out.println("Enter wall height (feet): ");
        
            if(!scnr.hasNext()) {
                scnr.next();

                continue;
            }

            wallHeight = scnr.nextDouble();
            // If wall height is greater than zero, continue on
            if (!(wallHeight > 0))
            continue;
            // Loop is terminated
            break;
            } while(true);


            // Implement a do-while loop to ensure input is valid
            // Prompt user to input wall's width
        do{
            System.out.println("Enter wall width (feet): ");

            if(!scnr.hasNext()) {
             scnr.next();
                continue;
            }
            wallWidth = scnr.nextDouble();
            // If wall width is greater than zero, continue on
            if(!(wallWidth > 0)) 
             continue;
        
            // Loop is terminated
                break;
            } while(true);


        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}
