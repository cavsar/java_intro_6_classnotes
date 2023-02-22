package utilities;

import java.util.Scanner;

public class ScannerHelper {
    static Scanner input = new Scanner(System.in);

    // Write a method that ask and return a first name from user
    public static String getFirstName(){
        System.out.println("Please enter a first name:");
        return input.nextLine();
    }


    // Write a method that ask and return a last name from user - returns String
    // method name should be getLastName
    // it should be static

    public static String getLastName(){
        System.out.println("Please enter a last name:");
        return input.nextLine();
    }

}
