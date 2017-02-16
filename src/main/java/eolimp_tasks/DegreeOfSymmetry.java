package eolimp_tasks;


import java.util.Scanner;
//TODO ASDADSSAD
public class DegreeOfSymmetry {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer b =  scanner.nextInt();
        int symmetryCount = 0;
        while (b > 0) {
            int curent = b % 10;
            int afterCurrent = b % 100;
            afterCurrent/=10;
            System.out.println("current = "+curent+" next  ="+afterCurrent);
            if (curent == afterCurrent) {
                symmetryCount++;
            }
            b = b/10;
        }
        System.out.println("Symmetry count = "+symmetryCount);
    }
}
