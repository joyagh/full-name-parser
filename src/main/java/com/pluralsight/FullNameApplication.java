package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Below enter your name in the following formats: First Last or First Middle Last");
        System.out.print("Full Name: ");
        String fullName = input.nextLine().trim();

        System.out.println(fullName);

        String [] names = fullName.split(" ");

        String firstName = names[0];
        String middleName;
        String lastName;

        if(names.length == 3){
            middleName = names[1];
            lastName = names[2];
        } else {
            middleName = "(none)";
            lastName = names[1];

            System.out.println();
            System.out.println();
            System.out.println();
        }



    }
}
