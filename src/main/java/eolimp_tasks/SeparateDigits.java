package eolimp_tasks;


import java.util.Scanner;

public class SeparateDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer b = scanner.nextInt();
        int summ = 0;
        int count = 0;
        while (b > 0) {

            System.out.println(b % 10);
            count++;
            summ += b % 10;
            b = b / 10;
        }
        System.out.println("Summ of all digits = " + summ);
        System.out.println("Count of digits = " + count);
    }
}
