package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; scanner.hasNext() == true; i++){
            System.out.println(i + " " + scanner.nextLine());
        }
    }
}
