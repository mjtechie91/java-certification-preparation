package lambdaexpression;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateInterfaceExample {

    public static void main(String[] args) {

/*        Predicate<String> p0 = s -> (s.equals("Java"));
        boolean result0 = p0.test("Java");
        System.out.println("Result0 = " + result0); //Result0 = true*/


      /*  Predicate<Integer> p1 = i -> i > 10;
        boolean result1 = p1.test(50);
        System.out.println("Result1 = "+ result1);

        Predicate<Integer> p2 = num -> num < 20;
        // boolean result2 = p1.or(p2).test(21);
        boolean result2 = p1.and(p2).test(15);
        System.out.println("Result2 = "+ result2);*/

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Tiger");
        animals.add("Ant");
        animals.add("Lion");
        animals.add("Elephant");


        System.out.println("Animals: "+ animals);

        animals.removeIf(a -> a.equals("Ant"));

        System.out.println("Updated Animals: "+ animals);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int enteredNumber = scanner.nextInt();

        Predicate<Integer> evenCheck = num -> num % 2 == 0;
        //if(isEven(enteredNumber, num -> num % 2 == 0)){
        if(isEven(enteredNumber, evenCheck)){
            System.out.println("Entered number is an even number");
        } else {
            System.out.println("Entered number is an odd number");
        }

        scanner.close();

    }

    public static boolean isEven(int number, Predicate<Integer> p){
        return p.test(number);
    }
}
