package de.gularesk;

public class GruppenAufgabe {

    public static void main(String[] args) {
        int a = -1;
        int b = 2;
        System.out.println(add(a, b));
        double c = 1;
        double d = 0;
        System.out.println(add(c, d));
        System.out.println(add(c, d));
        System.out.println(substract(a, b));
        System.out.println(makePositive(a));


        // Create a conditional statement to call the 'subtract'
        // method if the first number is greater than the second,
        // otherwise call the 'add' method.
        if (a > b) {
            System.out.println(substract(a, b));
        } else {
            System.out.println(add(a, b));
        }

        //Write a method that checks if a number is even. Even numbers
        // should be returned
        // as is, while odd numbers should be doubled.
        int number = 7;
        System.out.println("Die Nummer ist gerade oder nicht:" + checkEven(number));

        //Write a method that takes a string as a parameter and checks if it is a palindrome
        // (i.e., reads the same forwards and backwards). Return true if it is a palindrome, otherwise return false.
        String name = "ab c cba";

        System.out.println(isPalindrom(name));


    }


    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double c, double d) {
        return c + d;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static int makePositive(int a) {
        if (a < 0) {
            return -a;
        }
        return a;
    }

    public static int checkEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Ist gerade");
            return number;
        } else {
            System.out.println("Ist ungerade");
            return number * 2;

        }
    }

    public static boolean isPalindrom(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        while (right >= left) {
            if (word.charAt(left) == ' ') {
                left++;
            } else if (word.charAt(right) == ' ') {
                right--;
            } else if (word.charAt(left) == word.charAt(right)) {
                left++;
                right--;
            } else {
                System.out.println("ist nicht Palindrome");
                return false;
            }
        }
        System.out.println("ist Palindrome");
        return true;
    }
}