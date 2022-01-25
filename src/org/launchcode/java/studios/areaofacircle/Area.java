package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        Double r = input.nextDouble();
        Circle circle = new Circle();
        System.out.println("The area of a circle of radius " + r + " is: " + circle.getArea(r));

    }
}
