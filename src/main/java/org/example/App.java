package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */

public class App 
{
    public static void main( String[] args )
    {
        String username;
        String passwordAttempt;
        String password = "abc$123";

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your username? ");
        username = sc.nextLine();

        System.out.print("What is the password? ");
        passwordAttempt = sc.nextLine();

        if(passwordAttempt.equals(password))
        {
            System.out.println("Welcome " + username + "!");

        }
        else
        {
            System.out.println("I don't know you.");
        }

        sc.close();
    }
}
