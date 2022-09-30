// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student 90 Point Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        //End of given work ->
        double MonthRate = (annualRate/100) / 12;
        double numMonths = numYears * 12;
        double numerator = MonthRate * Math.pow(1 + MonthRate, numMonths);
        double denom = Math.pow(1 + MonthRate, numMonths) - 1;
        double MonthPay = numerator/denom * principal;
        //End of Monthly Pay
        double TotalPay = MonthPay * numMonths;
        double Totalint = TotalPay - principal;

        System.out.println("Principal:\t\t\t" + "$" + principal);
        System.out.println("Annual Rate:\t\t" + annualRate + "%");
        System.out.println("Number of Years:\t" + numYears);
        System.out.println("Monthly Payment:\t"+ "$" + MonthPay);
        System.out.println("Total Payments:\t\t" + "$" + TotalPay);
        System.out.println("Total Interest:\t\t" + "$" + Totalint);

    }
}

