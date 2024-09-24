package de.gularesk;

public class Main {
    public static void main(String[] args) {
        int age = 18;
        String name = "Max";

        int age1 = 27;
        String name1 = "Florian";

        int age2 = 65;
        String name3 = "Peter";


        boolean isOldEnough = true;
        checkAge(age, name);
        checkAge(age1, name1);
        System.out.println("Ende");

        checkAge(age2);
        System.out.println(age2);

    }

    public static void checkAge(int age, String name) {
        if (age > 18 && age < 50) {
            System.out.println(name + " is arbeitsfähig");

        } else if (age == 18) {
            System.out.printf("Die Person ist genau 18 Jahre alt");
        } else {
            System.out.println(name + " ist nicht volljährig");
        }
    }

    public static boolean checkAge(int age) {
        if (age > 18 && age < 50) {
            age++;
            return true;

        } else {age++;
            return false;
        }


    }


}