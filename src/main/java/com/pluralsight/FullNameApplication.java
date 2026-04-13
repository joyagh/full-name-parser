package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Below enter your name in the following formats: First Last or First Middle Last");
        System.out.print("Full Name: ");
        String fullName = input.nextLine().trim();

        System.out.println(fullName);

        String [] names = fullName.split("");

        String firstName = names[0];
        String middleName;
        String lastName;



    }
}
