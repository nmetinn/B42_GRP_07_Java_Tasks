package cydeo.java.Alvaro;

public class Divide_Without_Operator {
    /*

    Numbers -- Divide without / operator
    Write a method that can divide two numbers without using division operator
     */

    public static void main(String[] args) {

        int num1 = 100;

        int num2 = 4;

        int quotient = 0;

        for (int i = 0; i < num1; i++) {
            if (num2 * i == num1){
                quotient = i;
            }
        }

        System.out.println("quotient = " + quotient);

        //The exercise does not specify details, so I made it functional for Integer numbers
        //This works when num1 is divisible by num2
    }

}
