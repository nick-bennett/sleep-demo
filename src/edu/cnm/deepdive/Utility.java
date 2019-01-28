package edu.cnm.deepdive;

import java.util.Scanner;

public class Utility {

  static void processInput() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine().trim();
      if (!input.isEmpty()) {
        System.out.println(input.toUpperCase());
      }
    }
  }

  static void takeNap(long duration) {
    try {
      System.out.printf("Going to sleep for %.2f seconds\u2026%n", duration / 1000.0);
      Thread.sleep(duration);
    } catch (InterruptedException e) {
      // DO NOTHING!
    } finally {
      System.out.println("\u2026waking up now!");
    }
  }
}
