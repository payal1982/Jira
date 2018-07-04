import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//program to accept user input for different fields for Jira and storing the user input in a file
public class Details
{
    public static void main(String[]args) throws FileNotFoundException
    {
        Scanner sc=new Scanner(System.in);
        File file=new File("Jira.txt");
        PrintWriter writer=new PrintWriter(file);
        System.out.println("Please enter the below details.");
        System.out.println("Summary Title:");
        String title=sc.nextLine();
        writer.write(title);
        System.out.println("Type:");
        String type=sc.nextLine();
        writer.write(type);
        System.out.println("Description:");
        String description=sc.nextLine();
        writer.write(description);
        System.out.println("Steps to produce:");
        String steps_prod=sc.nextLine();
        writer.write(steps_prod);
        System.out.println("Expected Result:");
        String expected_result=sc.nextLine();
        writer.write(expected_result);
        System.out.println("Actual Result:");
        String actual_result=sc.nextLine();
        writer.write(actual_result);
        System.out.println("Logged User:");
        String logged_user=sc.nextLine();
        writer.write(logged_user);
        System.out.println("Environment:");
        String environment=sc.nextLine();
        writer.write(environment);
        System.out.println("Tester:");
        String tester=sc.nextLine();
        writer.write(tester);
        System.out.println("Date/Time:");
        String date_time=sc.nextLine();
        writer.write(date_time);
        System.out.println("Status(Pass/Fail):");
        String status=sc.nextLine();
        writer.write(status);
        System.out.println("Priority:");
        String priority=sc.nextLine();
        writer.write(priority);
        System.out.println("Severity:");
        String severity=sc.nextLine();
        writer.write(severity);
        System.out.println("Attachment:");
        String attachment=sc.nextLine();
        writer.write(attachment);


    }

}
