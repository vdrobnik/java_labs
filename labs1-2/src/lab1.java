import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        while(true) {
            if(num == 1) {
                System.out.print(num);
                System.out.printf("\n");
                break;
            }
            if (num % 2 == 1) {
                num = num * 3 + 1;
                System.out.print(num);
                System.out.printf("\n");
            }
            else if(num % 2 == 0) {
                num = num / 2;
                System.out.print(num);
                System.out.printf("\n");

            }
        }
    }
}