package eolimp_tasks;


import java.util.Scanner;

public class RepeatTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer b = scanner.nextInt();
        int variable = b;
        int localSum = 0;
        int countTimes = 0;

        while (variable > 0) {
            localSum = getLocalSum(variable);
            variable -= localSum;
            System.out.println("variable = " + variable);
            if (variable >= 0) {
                countTimes++;
            }
        }
        System.out.println("Count times = " + countTimes);
    }
    private static int getLocalSum(Integer b) {
        int localSum = 0;
        while (b > 0) {
            localSum += b % 10;
            b = b / 10;
        }
        return localSum;
    }
}
