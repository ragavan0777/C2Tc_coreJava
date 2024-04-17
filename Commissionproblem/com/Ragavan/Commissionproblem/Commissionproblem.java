package com.Ragavan.Commissionproblem;
import java.util.Scanner;
public class Commissionproblem {
		
		public String Name,Address;
		public long PhoneNo;
		public double SalesAmount,commission;
		public void Accept_Details_of_an_Employee() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Name:");
			Name = scanner.nextLine();
			System.out.println("Enter the Address:");
			Address = scanner.nextLine();
			System.out.println("Enter the PhoneNo:");
			PhoneNo = scanner.nextLong();
			System.out.println("Enter the SalesAmount:");
			SalesAmount = scanner.nextFloat();
			scanner.close();
		}
		public double CalculateCommission() {
			if(SalesAmount >= 100000)
				return SalesAmount*0.01;
			else if(50000 <= SalesAmount && SalesAmount < 100000 )
				return SalesAmount*0.05;
			else if(30000 <= SalesAmount && SalesAmount < 50000 )
				return SalesAmount*0.03;
			else
				return 0;	
		}
	}
