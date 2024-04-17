package com.Ragavan.Commissionproblem;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		Commissionproblem commission = new Commissionproblem();
		commission.Accept_Details_of_an_Employee();
		double commissionAmount = commission.CalculateCommission();
		System.out.println("The commission Amount is :"+commissionAmount);
		
	}

}