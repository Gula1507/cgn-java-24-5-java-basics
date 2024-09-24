package de.gularesk;

public class HelloWorld {
    public static void main(String[] args) {


        //Coding: Java Intro
        String greeting = "Hello, Java!";
        System.out.println(greeting);
        greeting = "Java is cool!";
        System.out.println(greeting);



        //Coding: Operators
        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println("Sum: " + sum);
        System.out.println();

        //Coding: Relational Operators
        int substraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        System.out.println("For integers "+ a+" and "+b + ":");
        System.out.println("Division: " + division);
        System.out.println("Substraction: " + substraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Addition: "+ sum);
        boolean greatherThan = a > b;
        boolean lessThan = a < b;
        boolean equality = a == b;
        System.out.println("Equality: " + equality);
        System.out.println(a+" lessThan " + b + ": "+lessThan);
        System.out.println(a+" greatherThan " + b +": "+greatherThan);
        System.out.println();

        double c = 1;
        double d = 2;
        double substractionDoubles = c - d;
        double multiplicationDoubles = c * d;
        double divisionDoubles = c / d;

        System.out.println("For doubles "+ c+" and "+d + ":");
        System.out.println("Division: " + divisionDoubles);
        System.out.println("Substraction: " + substractionDoubles);
        System.out.println("Multiplication: " + multiplicationDoubles);
        boolean doublesGreatherThan = c > d;
        boolean doublesLessThan = c < d;
        boolean equalityDoubles = c == d;
        System.out.println("Equality: " + equalityDoubles);
        System.out.println(c+" lessThan " + d +": "+ doublesLessThan);
        System.out.println(c+" greatherThan " + d + ": "+doublesGreatherThan);
        System.out.println();

        float x = 1;
        float y = 3;
        float substractionFloats = x-y;
       float multiplicationFloats = x*y;
       float divisionFloats = x/y;

        System.out.println("For floats "+ x+" and "+y + ":");
        System.out.println("Substraction: " + substractionFloats);
        System.out.println("Multiplication: " + multiplicationFloats);
        System.out.println("Division: " + divisionFloats);

        boolean greatherThanFloat = x > y;
        boolean lessThanFloat = x < y;
        boolean equalityFloats = x == y;
        System.out.println("Equality: " + equalityFloats);
        System.out.println(x+" lessThan " + y + ": "+ lessThanFloat);
        System.out.println(x+" greatherThan " + y + ": "+ greatherThanFloat);

        System.out.println("Git test");
    }
}
