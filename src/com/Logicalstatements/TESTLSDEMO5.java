package com.Logicalstatements;

import java.util.Scanner;

public class TESTLSDEMO5 {

    // Marriage eligibility check
    public static void main(String[] args) {

        System.out.println("main method started");
        System.out.println("welcome to the kammashaadhi.com");

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your full name:");
        String name = sc.nextLine();

        System.out.println("hey hi let's chat Mr. " + name);

        System.out.println("enter your assets:");
        double assets = sc.nextDouble();

        if (assets >= 30000000.00) {

            System.out.println("you are matched for the profile let's chat");

            System.out.println("enter your salary:");
            double salary = sc.nextDouble();

            if (salary >= 100000.00) {

                System.out.println("ok lets proceed");

                System.out.println("enter your age:");
                int age = sc.nextInt();

                if (age >= 24 && age <= 30) {

                    System.out.println("ok let's proceed");

                    System.out.println("enter your height:");
                    float height = sc.nextFloat();

                    System.out.println("enter your weight:");
                    double weight = sc.nextDouble();

                    if (height >= 5.6 && height <= 6.2
                            && weight >= 65 && weight <= 80) {

                        System.out.println("ok lets proceed");

                        System.out.println("do you have a big family? Enter true or false:");
                        boolean bigfamily = sc.nextBoolean();

                        if (bigfamily) {
                            System.out.println("no i dont like big family");
                        } else {
                            System.out.println("yes we can proceed to the marriage");
                        }

                        System.out.println("enter your dowry expectations:");
                        int dowry = sc.nextInt();

                        if (dowry >= 1500000 && dowry <= 3500000) {
                            System.out.println("you are eligible for this profile");
                        } else {
                            System.out.println("your dowry expectations is too high");
                        }

                    } else {
                        System.out.println("you are not eligible for this match");
                    }

                } else {
                    System.out.println("your age is not matched for the profiles");
                }

            } else {
                System.out.println("you are not matched with our expectations");
            }

        } else {
            System.out.println("you are not matched to the profile");
        }

        System.out.println("main method ended");
        sc.close();
    }
}
