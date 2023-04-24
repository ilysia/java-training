package Hackerrank.QueueFromStacks;

import java.io.*;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        QueueFromStacks queue = new QueueFromStacks();
        int numberOfSteps = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int step = 0; step < numberOfSteps; step++) {

            int stepType = scanner.nextInt();

            switch (stepType) {
                case 1:
                    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                    int e = scanner.nextInt();
                    queue.enqueue(e);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                default:
                    queue.print();
            }

            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        }
        scanner.close();
    }
}