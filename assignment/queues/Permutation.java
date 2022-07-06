
/**
 * Author: August Frisk
 * Course: Coursera Algorithms, Part 1 - Spring 2019
 * Assign: Queues
 * File: Permutation.java
 */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Client program that takes a command-line integer k, reads in a sequence of
 * N strings from standard input and prints out exactly k of them, uniformly
 * at random. Each item from the sequence can be printed out at most once.
 */
public class Permutation {
    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);

        RandomizedQueue<String> queue = new RandomizedQueue<>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            queue.enqueue(item);
        }

        for (int i = 0; i < count; i++) {
            StdOut.println(queue.dequeue());
        }
    }
}
