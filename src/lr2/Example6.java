package lr2;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        int thousands = n / 1000 % 10;
        System.out.println("Количество тысяч: " + thousands);
        in.close();
    }
}