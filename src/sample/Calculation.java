package sample;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //System.out.println("Введите число");
        int one = console.nextInt();
       // System.out.println("Введите второе число");
        int two = console.nextInt();
        console.nextLine();
       // System.out.println("Ввод операции");
        String har = console.nextLine();

        float result = 0f;
        if(har.equals("*")){
            result = one*two;
        }
        if(har.equals("+")){
            result = one+two;
        }
        if(har.equals("-")){
            result = one - two;
        }
        if(har.equals("/")){
            result = one/two;
        }
       // System.out.println("Ответ:");
        System.out.println(one + har + two + "=" + result );
    }
}
