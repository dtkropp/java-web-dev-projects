package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius");
        double radius = input.nextDouble();
        boolean isValid = false;
        while(!isValid) {
            if (radius > 0) {

                isValid = true;
            } else {
                System.out.println("Please enter a positive number");
                radius = input.nextDouble();
            }
        }
        System.out.println("Your circle has an area of " +Circle.getArea(radius));
    }

}
