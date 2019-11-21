package pl.maciejslusarz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wpisz liczbę: ");
        int number = input.nextInt();
	    /*while (true) {
	        /*
	        if (number % 2 == 0) {
                System.out.println("2");
                number /= 2;
            } else if (number % 3 == 0) {
                System.out.println("3");
                number /= 3;
            } else if (number % 5 == 0) {
                System.out.println("5");
                number /= 5;
            } else if (number % 7 == 0) {
                System.out.println("7");
                number /= 7;
            } else if (number % 11 == 0) {
                System.out.println("11");
                number /= 11;
            } else if (number % number == 0) {
	            System.out.println(number);
	            number /= number;
	            break;
            } else {
                System.out.println("Ta liczba jest zbyt skomplikowana dla tego programu");
                break;
            }
            }*/
        while (true) {
            System.out.print(number + " ");
            for (int i = 2; i <= number; ) {
                if (number % i == 0) {
                    System.out.println(i);
                    number /= i;
                    System.out.print(number + " ");
                    i = 2;
                } else {
                    ++i;
                }
            }
            System.out.print(number);
            number /= number;
            break;
        }
        System.out.println("\n" + number);
        //Gdy liczba prawidłowa powinno być "1"
    }
}
