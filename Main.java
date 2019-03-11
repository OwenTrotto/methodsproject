package org.LickingHeights;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello World");

        printGreetings("Owen");


        int a = 3;
        int b = 4;
        System.out.println(multiply(a,b));

        int c = 71;
        int d = 6;
        System.out.println(divide(c,d));


        }

        public static void printGreetings(String noun) {
        System.out.println("Hello "+ noun);

    }

        public static int multiply(int firstNumber, int secondNumber){

        int answer = firstNumber*secondNumber;

        return answer;
        }

        public static double divide(double firstNumber, double secondNumber){

        double answer = firstNumber/secondNumber;

        return answer;


    }





        }




































}
