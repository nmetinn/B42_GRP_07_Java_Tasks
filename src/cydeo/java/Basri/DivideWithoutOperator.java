package cydeo.java.Basri;

public class DivideWithoutOperator {
    public static int dived(int dividend, int divisor ){
        if (divisor == 0){
            System.out.println("Can not divided by zero");
        }
        int result =0;
        while (dividend >= divisor){
            dividend -= divisor;
            result++;

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(dived(12,2));
        System.out.println(dived(9,3));
        System.out.println(dived(7,2));
        System.out.println(dived(10,0));
    }



    /*
    Numbers -- Divide without / operator
    Write a method that can divide two numbers without using division operator

     */

}
