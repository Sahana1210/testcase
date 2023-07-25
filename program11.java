package assignment;

import java.util.Scanner;

public class program11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        char str=65;
        for(int i=1;i<=n;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        	System.out.print(str);
        	}
        	str++;
        	System.out.println();
        }

	}

}
