// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        //90 Point Version  completed 09/30, 100 Point on 10/03
        System.out.println();
        System.out.println("Lab04a, Student 100 Point Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        //End of given work ->
        double MonthRate = (annualRate/100) / 12;
        double numMonths = numYears * 12;
        double numerator = MonthRate * Math.pow(1 + MonthRate, numMonths);
        double denom = Math.pow(1 + MonthRate, numMonths) - 1;
        double MonthPay = numerator/denom * principal;
        MonthPay *= 100;
        MonthPay = Math.round(MonthPay);
        MonthPay /= 100;
        //End of Monthly Pay
        double TotalPay = MonthPay * numMonths;
        TotalPay *= 100;
        TotalPay = Math.round(TotalPay);
        TotalPay /= 100;
        double Totalint = TotalPay - principal;
        Totalint *= 100;
        Totalint = Math.round(Totalint);
        Totalint /= 100;

        System.out.println("Principal:\t\t\t" + "$" + principal);
        System.out.println("Annual Rate:\t\t" + annualRate + "%");
        System.out.println("Number of Years:\t" + numYears);
        System.out.println("Monthly Payment:\t"+ "$" + MonthPay);
        System.out.println("Total Payments:\t\t" + "$" + TotalPay);
        System.out.println("Total Interest:\t\t" + "$" + Totalint);

    }
}

