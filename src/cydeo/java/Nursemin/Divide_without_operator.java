package cydeo.java.Nursemin;

public class Divide_without_operator {
    /*

    Numbers -- Divide without / operator
    Write a method that can divide two numbers without using division operator
     */

    public static void main(String[] args) {
        divideWithoutOperator(6,2);
        divideWithoutOperator(2,6);
    }
    public static int divideWithoutOperator(int num1, int num2){
        int count=0;
        while(num1>=num2){
            num1 -= num2;
            count++;
        }
        System.out.println("Division is "+count);
        return count;
    }


}
