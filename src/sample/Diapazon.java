package sample;

import java.util.Scanner;

public class Diapazon {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int n = 0;
        if (b>a) {
            int curNumber = a+1;
            while (curNumber < b) {
                n = n + curNumber;
                curNumber++;
            }

            System.out.println(n);
        } else {
            System.out.println("Некорректно!");
        }
    }
}
