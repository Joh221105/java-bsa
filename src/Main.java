package src;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lowRange = getLowRange(scan);
        int highRange = getHighRange(scan);
        int target = generateTarget(lowRange, highRange);
        int result = binarySearch(lowRange, highRange, target);
        System.out.println("The target is: " + target);
        System.out.println("The result is: " + result );
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

    private static int binarySearch(int low, int high, int target){
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("Searching... Midpoint: " + mid);

            if (mid == target) {
                return mid;
            } else if (mid < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // target not found
    }
}
