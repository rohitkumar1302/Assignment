// package class.project;
// package training;

import java.util.Scanner;

public class Grade {
    static Scanner sc = new Scanner(System.in);
    static String[] sub;
    static int[] arr;
    static int a;

    static void input() {
        for (int i = 0; i < a; i++) {
            System.out.println("Enter the Subject name: ");
            sub[i] = sc.nextLine();
            System.out.println("Enter the Subject marks: ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
    }

    static double average() {
        int sum = 0;
        for (int i = 0; i < a; i++)
            sum = sum + arr[i];
        return ((double) sum / a);
    }

    static void display() {
        for (int i = 0; i < a; i++) {
            System.out.println(sub[i] + ": " + arr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter total number of Subject ");
        a = Integer.parseInt(sc.nextLine());
        arr = new int[a];
        sub = new String[a];
        input();
        double ave = average();
        System.err.println(ave);
        display();
        if (ave > 39)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}