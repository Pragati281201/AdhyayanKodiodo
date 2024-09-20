package Task3;

import java.util.Scanner;

public class Data {
		Que3 q = new Que3();
		Scanner s = new Scanner(System.in);
		public void createAccount()
		{
			System.out.println("Enter Account Id : ");
			int accNo = s.nextInt();
			q.setAccNo(accNo);
			
			System.out.println("Enter your Account Holder Name : ");
			String accHolderName = s.next()+s.nextLine();
			q.setAccHolderName(accHolderName);
				
			System.out.println("Enter Age : ");
			int age = s.nextInt();
			q.setAge(age);
		
			System.out.println("Enter Adhar Number : ");
			long adharNo = s.nextLong();
			q.setAdharNo(adharNo);
			
			System.out.println("Enter Mobile Number : ");
			long mobNo = s.nextLong();
			q.setMobNo(mobNo);
			
			System.out.println("Enter Address : ");
			String address = s.next()+s.nextLine();
			q.setAddress(address);
			
			System.out.println("Enter Account Balance : ");
			double accBalance = s.nextDouble();
			q.setAccBalance(accBalance); 
			
			System.out.println();
		}
		
		
		public void depositMoney()
		
		{
			System.out.println("Enter your Deposit Amount : ");
			double	depAmount = s.nextDouble();
			if(depAmount > 0) {
				System.out.println("Amount Entered Successfully");
			}
			else(depAmo) {
				
			}
		}
	}


