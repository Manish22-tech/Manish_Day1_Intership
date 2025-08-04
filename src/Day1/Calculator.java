package Day1;

import java.util.Scanner;

public class Calculator {
     public static double add(double a,double b){
         return a+b;
     }
     public static double subtract(double a,double b){
         return  a-b;
     }
     public static double multiply(double a,double b){
         return a*b;
     }
     public static double divide(double a,double b){
         if(b==0){
             System.out.println("Conot divide by zero");
             return 0;
         }
         return a/b;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean continueCalc=true;

        while(continueCalc){
            System.out.println("Choose Operation: +,-,*,/ ");
            char operator=sc.next().charAt(0);

            System.out.print("Enter First number: ");
            double num1=sc.nextDouble();
            System.out.print("Enter First number: ");
            double num2=sc.nextDouble();

            double result=0;

            switch (operator){
                case '+':
                    result=add(num1,num2);
                    break;
                case '-':
                    result=subtract(num1,num2);
                    break;
                case '*':
                    result=multiply(num1,num2);
                    break;
                case '/':
                    result=divide(num1,num2);
                    break;
                default:
                    System.out.println("Invalid Opeator");
                    continue;
            }
            System.out.println("Result: "+result);
            System.out.println("Do you want to perform calculation? (yes/no):");
            String answer=sc.next();

            if(!answer.equalsIgnoreCase("yes")){
                continueCalc=false;
            }
        }
        System.out.println("Calculator exited.");
        sc.close();

    }
}
