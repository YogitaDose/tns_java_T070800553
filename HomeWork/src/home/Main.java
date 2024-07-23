package home;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to CALCULATE FACTORIAL OR 2 to CALCULATE AREA OF CIRCLE");
		int choice=sc.nextInt();
		Processor p;
		if(choice==1)
		{
			p=new Factorial();
			System.out.println("Enter a no. to calculate factorial");
		}
		else if(choice==2)
		{
			p=new Circle();
			System.out.println("Enter radius to calculate area of circle");
		}
		else
		{
			System.out.println("INVALID CHOICE");
			sc.close();
			return;
		}
		p.data=sc.nextInt();
		p.showData();
		p.process();
		sc.close();
		
	}

}
