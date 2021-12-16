package com.xworkz.additionalExamples;

public class Triangle {

	public static void main(String[] args) {
		final int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");//or System.out.print(System.lineSeperator());
		}

	}

}
