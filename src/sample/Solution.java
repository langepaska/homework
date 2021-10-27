package sample;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        while(a<100){
            a++;
            if((a % 3)!=0){
                sum = sum + a;
            }


        }
        System.out.println(sum);
    }

}

class  Mazafaka   {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int n = 1;
        if(a>=1 && a<=10){
            int curNumber = 1;

            while(curNumber <= a){
                n = n*curNumber;
                curNumber++;
            }

            System.out.println(n);
        }else{
            System.out.println("Некорректно!");
        }

    }
}


