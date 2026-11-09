package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        if (n % 4 == 0 && n >= 10) {
            System.out.println("Число " + n + " удовлетворяет условиям");
        } else {
            System.out.println("Число " + n + " не удовлетворяет условиям");
        }
        in.close();
    }
}
