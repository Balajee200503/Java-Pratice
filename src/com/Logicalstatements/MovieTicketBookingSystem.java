package com.Logicalstatements;

import java.util.Scanner;

public class MovieTicketBookingSystem {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Chukka Chitaralu Cinemas");

    System.out.println("TFI Baanisa Name:");
    String name = sc.nextLine();

    System.out.println("Enter Movie Name:");
    String mn = sc.nextLine();

    System.out.println("Enter Customer Age:");
    int ca = sc.nextInt();

    if (ca >= 18) {

        System.out.println("Ok mowa yedhigav ayithe!");

        System.out.println("Enter Number of Tickets:");
        int tickets = sc.nextInt();

        if (tickets > 0) {

            System.out.println("Ticket dorikindha mowaa ewwwwww ");

            System.out.println("Enter Show Timing (24-hour format):");
            int time = sc.nextInt();

            if (time >= 0 && time <= 23) {

                double price = 200;
                double total = price * tickets;
                double discount = 0;

                if (time < 12) {

                    discount = total * 0.10;
                    System.out.println("10% morning show discount vacchindhi enjoyy pandgoww");

                } else {

                    System.out.println("Free ga discount dobbeyddam aneyyy pedda planning ye!");

                }

                double finalAmount = total - discount;

                System.out.println("----- TICKET DETAILS -----");

                System.out.println("Customer Name: " + name);
                System.out.println("Movie Name: " + mn);
                System.out.println("Customer Age: " + ca);
                System.out.println("Number of Tickets: " + tickets);
                System.out.println("Ticket Price: Rs." + price);
                System.out.println("Total Amount: Rs." + total);
                System.out.println("Discount: Rs." + discount);
                System.out.println("Final Amount: Rs." + finalAmount);

                System.out.println("\nMotthaniki ticket sampadinchav nv magadivi ra bujji!");

            } else {

                System.out.println("Invalid Show Timing!");

            }

        } else {

            System.out.println("Invalid Ticket Quantity!");

        }

    } else {

        System.out.println("Pillalu ra meeru! Entry Not Allowed.");

    }

    System.out.println("Thank you for visiting Chukka Chitaralu Cinemas!");

    sc.close();
}


}
