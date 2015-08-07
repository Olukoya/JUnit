import java.util.Scanner;
public class CalcApp {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("What is the the first number? :");
		int num1=Integer.parseInt(in.nextLine());
		
		System.out.println("1 - Addition\n"
						 + "2 - Subtraction\n"
						 + "3 - Multiplication\n"
						 + "4 - Division\n"
						 + "5 - Modulus\n"
						 + "What do you want to do?"
						 + "");
		int choice=Integer.parseInt(in.nextLine());
		
		System.out.println("What is the second number ? :");
		int num2=Integer.parseInt(in.nextLine());
		
		Calc item = new Calc();
		if(choice==1)
			System.out.println(item.addition(num1, num2));
		else if(choice==2)
			System.out.println(item.subtraction(num1, num2));
		else if(choice==3)
			System.out.println(item.multiplication(num1, num2));
		else if (choice==4)
			System.out.println(item.division(num1, num2));
		else if (choice==5)
			System.out.println(item.modulus(num1, num2));
		else
			System.out.println("Invalid Operation");
		in.close();
		
	}

}
