import java.util.Scanner;

public class HelloWorld {

public static void main(String[] args)
    {
	Scanner sc = new Scanner (System.in); // Create Scanner object
	System.out.println("Enter the first number: ");

	int FirstNumb = sc.nextInt();
	System.out.println("Enter the second number: ");
	int SecondNumb = sc.nextInt();

	System.out.println(FirstNumb * SecondNumb);
    }	    
}
















