package cydeo.java.Basri;

public class Week01_OddOrEven {
    public static void main(String[] args) {

        /*
        Write a method which can identifies given number is even or odd
         EX:
         identify(5) -> "Odd"
          identify(6) -> "Even"
         */
        oddOrEven(6);
    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println("number even");
        } else {
            System.out.println("number odd");
        }

    }
}
