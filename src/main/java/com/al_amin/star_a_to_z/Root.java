package com.al_amin.star_a_to_z;

public class Root {
    static int height = 3;
    static int width = (2 * height) - 1;

    static void printA() {

        int n = width / 2, i, j;
        for (i = 0; i < height; i++)
        {
            for (j = 0; j <= width; j++)
            {
                if (j == n || j == (width - n) || (i == height / 2 && j > n && j < (width - n)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
            n--;
        }
    }
    static void printI() {
        int i, j;
        for (i = 0; i < height; i++)
        {
            for (j = 0; j < height; j++)
            {

                if (i == 0 || i == height - 1)
                    System.out.print("*");
                else if (j == height / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    static void printN() {
        int i, j, counter = 0;
        for (i = 0; i < height; i++)
        {
            System.out.print("*");
            for (j = 0; j <= height; j++)
            {
                if (j == height)
                    System.out.print("*");
                else if (j == counter)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            counter++;
            System.out.print("\n");
        }
    }
    static void printT() {
        int i, j;
        for (i = 0; i < height; i++)
        {
            for (j = 0; j < height; j++)
            {
                if (i == 0)
                    System.out.print("*");
                else if (j == height / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    static void printPattern(char character) {
        switch (character) {
            case 'A' -> printA();
            case 'I' -> printI();
            case 'N' -> printN();
            case 'T' -> printT();
        }
    }
    public static void main(String[] args) {
        System.out.println("");
        printPattern('T');
        System.out.println();
        printPattern('A');
        System.out.println();
        printPattern('N');
        System.out.println();
        printPattern('I');
        System.out.println();
        printPattern('A');
    }
}
