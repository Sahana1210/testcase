package assignment;

import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("no:");
		int n=s.nextInt();
		int sum=0,d;
		while(n!=0)
		{
			d=n%10;
			sum=sum+d;
			n=n/10;
			}
		System.out.println(+sum);

	}

}

