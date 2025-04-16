
import java.sql.SQLOutput;

public class PayrollCalculator{

    public static void main(String[] args){

       //Get the known values.
        System.out.println("Please enter the employee name");
       String name = scanner.nextLine();

        System.out.println("Please enter the number of hours worked this pay period: ");
       float hoursworked = scanner.nextfloat();

        System.out.println("Please enter the base pay rate: ");
       double payRate = scanner.nextDouble();



       //Calculate the uknown
        double grossPay = calcGrossPay(hoursWorked, payRate);


        //Display the results
        System.out.println("%s worked %f hours at a rate of %f and made %f, name , hoursWorked, payRate. grossPay");

    }

    public static double calcGrossPay(float hoursWorked, double parRate){
        if (hoursWorked <= 40){
            return hoursWorked * payRate;
        }
    }

}

public static double calcGrossPay(float hoursWorked, double payRate)

public static String promptForName(){
    System.out.println("Please enter the employee name: ");
    String result = scanner.nextLine();
    return result
}