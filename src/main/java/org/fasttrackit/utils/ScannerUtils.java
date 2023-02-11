package org.fasttrackit.utils;


import java.util.Scanner;

public class ScannerUtils {
    Scanner scanner = new Scanner(System.in);

    public int nextIntAndMoveToNextLine() {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        scanner.nextLine();
        return integer;

    }

public String nextLine() {
        return scanner.nextLine();
}
}
