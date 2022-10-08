package lambdaConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class IterrateJava {
	public static void main(String[] args) {
		
		ArrayList<String> tvSeries = new ArrayList();
		tvSeries.add("GameOfThrones");
		tvSeries.add("The BigBang");
		tvSeries.add("Breaking Bad");
		tvSeries.add("Prison Break");
		tvSeries.add("cha cha cha");
		//1. using Java 8 with for each loop
		
		tvSeries.forEach(shows->System.out.println(shows));
		
		//Iterator
		System.out.println("******Using Iterator*******");
		Iterator<String> itr = tvSeries.iterator();
		while(itr.hasNext())
		{
			String show=itr.next();
			System.out.println(show);
		}		
		//For eachRemaining Iterator - java 8 
		
		System.out.println("*********Java 8 Iterator************");
		itr=tvSeries.iterator();
		itr.forEachRemaining(show->System.out.println(show));
		
		
		System.out.println("****For Each*****");
		
		for(String show:tvSeries)
		{
			System.out.println(show);
		}
		
		System.out.println("****For loop index*****");
		
		for(int i=0;i<tvSeries.size();i++)
		{
			System.out.println(tvSeries.get(i));
		}
	}

}
