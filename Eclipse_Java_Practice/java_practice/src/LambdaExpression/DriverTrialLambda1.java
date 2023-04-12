package LambdaExpression;

import java.util.Scanner;

public class DriverTrialLambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first number");
  int A=sc.nextInt();
  //System.out.println("Enter the first number");
  //int b=sc.hashCode();
  
		Trial t1= ()->{
			System.out.println("Hi");
			System.out.println("Hello");
			System.out.println();
		};
		t1.demo();

	}

}
