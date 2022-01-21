package com.bridgelabz;

import java.util.Scanner;

public class StackQueue extends LinkedList {

    public static void main() {
        StackQueue stackQueue = new StackQueue();
        System.out.println("Welcome to Stacks and Queues Program");
        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();
        do {
            System.out.println("\n 1.Push in Stack \n 2.Pop from Stack \n 3.Display Stack \n 4.Quit ");
            switch (choice) {
                case 1:
                    System.out.println("Enter the Number");
                    int number = sc.nextInt();
                    stackQueue.insertFirst(number);
                case 2:
                    stackQueue.pop();
                    break;
                case 3:
                    stackQueue.showList();
                case 4:
                    System.out.println("Thank you");
                    break;
            }

        } while (choice != 4);
    }

}


