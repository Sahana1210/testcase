package assignment;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("No:");
		int n=s.nextInt();
		int count=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		System.out.println(+count);

	}

}
