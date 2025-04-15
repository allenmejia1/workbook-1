package com.pluralsight;

public class PayrollCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

       //Get the known values.
        System.out.println("Please enter the employee name");
       String name = scanner.nextLine();

        System.out.println("Please enter the number of hours worked this pay period: ");
       float hoursworked = scanner.nextfloat();

        System.out.println("Please enter the base pay rate: ");
       double payRate = scanner.nextDouble();



       //Calculate the uknown
        double grossPay = hoursWorked * payRate;


        //Display the results
        System.out.println("%s worked %f hours at a rate of %f and made %f, name , hoursWorked, pay");




    }
}

