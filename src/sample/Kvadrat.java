package sample;

import java.sql.SQLOutput;

public class Kvadrat {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 0;
        while (x < 10) {
            int y = 0;
           while(y<20){
               if (x!=0 && x!=9){
                   if(y==0 || y==19){
                       System.out.print("Б");
                   }else{
                       System.out.print(" ");
                   }

               }else{
                   System.out.print("Б");
               }
               y++;
           }
            System.out.println("");
            x++;
        }
    }
}
