import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("(V)anilla, (C)hocolate or (S)trawberry");
        
        String choice = myObj.nextLine();  // read user input
        double PpS = 0.0; // price per scoop

        if (choice.equalsIgnoreCase("v")) {
            PpS = 0.92;
        } else if (choice.equalsIgnoreCase("c")) {
            PpS = 0.23;
        } else if (choice.equalsIgnoreCase("s")) {
            PpS = 0.01;
        } else {
            PpS = 0.0;
           System.out.println("We don't have that flavour."); 
            
        }
        if (PpS != 0.0)
        {
            System.out.println("How many scoops");
            double nScoops = myObj.nextDouble();  // read user input
            if (nScoops <=3) {
            System.out.println("That will be " + nScoops*PpS + " please");
            } else {
            System.out.println("That's too many scoops to fit in a cone.");
            }
        }