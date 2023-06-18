package MyPkg;

import java.util.Scanner;

class ShowRoom{
	String name;
	long mobno;
	double cost,dis,disPer,amount;
	
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer Name:");
		name = sc.next();
		System.out.println("Enter customer Mobile Number:");
		mobno = sc.nextLong();
		System.out.println("Enter customer cost:");
		cost = sc.nextDouble();
		
	}
	void calculate() {
		if(cost<=10000)
		{
			disPer = 5;
		}
		else if(cost<=20000 && cost>10000) 
		{
			disPer = 10;
		}
		else if(cost<=35000 && cost>20000)
		{
			disPer = 15;
		}
		else 
		{
			disPer = 20;
		}
		dis = cost * disPer / 100.0;
		amount = cost - dis;
	}
	void display()
	{
		System.out.println("Customer Name:"+name);
		System.out.println("customer Mobile Number:"+mobno);
		System.out.println("Customer amount:"+amount);
		
	}
}

public class MainAppShowRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ShowRoom sr = new ShowRoom();
		sr.input();
		sr.calculate();
		sr.display();
	}

}
