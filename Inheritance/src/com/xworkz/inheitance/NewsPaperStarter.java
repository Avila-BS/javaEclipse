package com.xworkz.inheitance;
import com.xworkz.inheritance.NewspaperOperator.Newspaper;


public class NewsPaperStarter {

	public static void main(String[] args) {
		Newspaper paper=new Newspaper();
		
		Newspaper paper1=new Newspaper();
		
		
		boolean set=paper.equals(paper1);
		System.out.println(set);

	}

}
