package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        if (n % 5 == 2 && n % 7 == 1) {
            System.out.println("Число " + n + " удовлетворяет условиям");
        } else {
            System.out.println("Число " + n + " не удовлетворяет условиям");
        }
        in.close();
    }
}