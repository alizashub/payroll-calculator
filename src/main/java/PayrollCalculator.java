import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please write your name below :");
        String name = myScanner.nextLine();
        // System.out.println("Your name is " + name + ".");


        System.out.println("Tell me how many hours you worked this week?");
        double hoursWorkedInWeek = myScanner.nextInt();
        // System.out.println("You worked" + hoursWorkedInWeek + "this week");

        System.out.println("What is your hourly pay rate?");
        double hourlyPayRate = myScanner.nextInt();
        // System.out.println("Your hourly rate is" + hourlyPayRate );

        double Product = hoursWorkedInWeek * hourlyPayRate ;
        System.out.println(name + ",you made" + " " + "$"+ Product + " "+ "by working" + " " + hoursWorkedInWeek +" hours this week.");
    }

}
