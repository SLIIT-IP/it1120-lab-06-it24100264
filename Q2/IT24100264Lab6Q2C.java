import java.util.Scanner;

public class IT24100264Lab6Q2C {
    	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers:");
		
		// prinitng the prompt
		System.out.print("Enter number 1: ");
		// taking user input and save in variable num1 as integer
		int num1 = scanner.nextInt();

		System.out.print("Enter number 2: ");
		int num2 = scanner.nextInt();

		System.out.print("Enter number 3: ");
		int num3 = scanner.nextInt();
		
		System.out.print("Enter number 4: ");
		int num4 = scanner.nextInt();
		
		System.out.print("Enter number 5: ");
		int num5 = scanner.nextInt();
		
		System.out.print("Enter number 6: ");
		int num6 = scanner.nextInt();
		
		System.out.print("Enter number 7: ");
		int num7 = scanner.nextInt();
		
		System.out.print("Enter number 8: ");
		int num8 = scanner.nextInt();
		
		System.out.print("Enter number 9: ");
		int num9 = scanner.nextInt();		
		
		System.out.print("Enter number 10: ");
		int num10 = scanner.nextInt();
		
		System.out.println("\nThe numbers you entered are:");
		// printing all inputs
		System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9+" "+num10+" ");
		
		//calculating the sum
		int sum=num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
		//calculating the average
		double average = (double)sum/10.0;
		//printing sum
		System.out.println("\nSum of the numbers: "+sum);
		//printing average
		System.out.println("Average of the numbers: "+average);

	}

}
