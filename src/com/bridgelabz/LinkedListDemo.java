package com.bridgelabz;
import java.util.Scanner;

  class Node {
        int data;
        Node next;

        //Parameterized Constructor to initialize Data
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList {
        Node head;
        Node tail;

        //Adding Node to LinkedList
    /* 1. Allocate the Node from starting  &
           2. Put in the data
           3. Set next as null */
        public void insertFirst(int data) {
            Node newNode = new Node(data);
            //Linked List is Empty
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public void showList() {
            if (head == null) {
                System.out.println("Linked List is Empty.");
            } else {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }
        }
    /* 1. Allocate the Node from last &
           2. Put in the data
           3. Set next as null */

        //Insert Data from Last
        public void insertLast(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void insertafter(int data, int newdata) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                Node temp = head;
                Node nextNode;
                while (temp != null) {
                    nextNode = temp.next;
                    if (temp.data == newdata) {
                        temp.next = newNode;
                        newNode.next = nextNode;
                    }
                    temp = temp.next;
                }
            }
        }

        //Delete first node from Linked List
        public void pop() {
            if (head == null) {
                System.out.println("Linked List is Empty.");
            } else {
                head = head.next;
            }
        }

        public void popLast() {
            if (head == null) {
                System.out.println("Linked List is Empty.");
            } else {
                Node second_last = head;
                // Created an extra space secondLast, and traverse the linked list till the second last node and set the value of the next second-last node to null..
                // delete the last node, i.e. the next node of the second last node
                while (second_last.next.next != null) second_last = second_last.next;

                // Change next of second last
                second_last.next = null;
            }
        }

        public boolean search(Node head, int x) {
            Node current = head;    //Initialize current
            while (current != null) {
                if (current.data == x) return true;
                current = current.next;

            }
            return false;  //data not found

        }

        //Delete specific Node
        public void deleteNode(int data) {
            if (head == null) {
                System.out.println("Linked List is Empty.");
            } else {
                if (data == head.data) {
                    head = head.next;
                } else {
                    Node prevNode = head;
                    Node temp = head.next;
                    while (prevNode != null) {
                        if (temp.data == data) {
                            prevNode.next = temp.next;
                        }
                        prevNode = prevNode.next;
                        temp = temp.next;
                    }
                }
            }
        }

        //Size of Linkedlist
        public int getCount() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }





