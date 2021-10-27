package sample;

public class Test {
    public static void main(String[] args) {
    int a = 9;
        int x = 0;
        while (x < 3) {
            int y = 0;
            while (y < 3){
                System.out.print(a);
                y++;
                a--;
            }
            System.out.println();
            x++;
        }
    }
}

