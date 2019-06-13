import java.util.Scanner;

public class AverageofTwo
{
    public static void main( String[] args )
    {
        //variable declaration
        double num1, num2 , Sum, Av ;

        Scanner xx = new Scanner(System.in);

        System.out.print( "..Please Insert the first Double Values: " );
        num1 = xx.nextDouble();

        System.out.print( "..Please Insert the Second Double Values:" );
        num2 = xx.nextDouble();

        Sum=num1+num2; //summing up two double values
        Av=Sum/2;  //divide the sum of both variables by 2 and assign on Av variable

        System.out.print("The Average of two double numbers is:"+Av); //display the Average value to the console
    }
}



