package src;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lowRange = getLowRange(scan);
        int highRange = getHighRange(scan);
        int result = binarySearch(lowRange, highRange);
    }
    private static int getLowRange(Scanner scan){
        System.out.print("Please enter the low number: ");
        return scan.nextInt();
    }

    private static int getHighRange(Scanner scan){
        System.out.print("Please enter the high number: ");
        return scan.nextInt();
    }

    private static int generateTarget(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }

    private static int binarySearch(int low, int high){
//        while(true){
//
//        }
        return -1;
    }
}
