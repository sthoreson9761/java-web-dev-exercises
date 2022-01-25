package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);

        Double r;
        String initialInput;
        do{
            System.out.print("Enter a radius: ");
            initialInput = input.nextLine();
            if(Circle.inputValidation(initialInput)){
                r = Double.parseDouble(initialInput);
                System.out.println("The area of a circle of radius " + r + " is: " + Circle.getArea(r));
            }else {
                System.out.println("Invalid Input");
            }
        }while(Circle.inputValidation(initialInput) == false);

    }
}
