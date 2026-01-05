package cydeo.java.Nursemin;

public class Week01_OddOrEven {
    public static void main(String[] args) {
        /*
        Write a method which can identifies given number is even or odd
         EX:
         identify(5) -> "Odd"
          identify(6) -> "Even"
         */
        oddOrEven(5);;
    }

    public static void oddOrEven(int number) {
        if(number % 2==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
        System.out.println("Group 7 is studying");

    }
}
