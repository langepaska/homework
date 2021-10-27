package sample;

import java.util.Scanner;

public class Differense {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int n = 1;
        int difference = a - b;
        if (difference > 0) {
            int curNumber = 1;
            while (curNumber <= difference) {
                n = n * curNumber;
                curNumber++;
            }

            System.out.println(n);
        } else {
            System.out.println("Некорректно!");
        }
    }
}
