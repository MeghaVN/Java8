package lambdaConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryOperatorConcept {
	
	public static void main(String[] args) 
	{
		//BinaryOperator extends bifunction
		BinaryOperator<Integer> func = (x1,x2)->x1+x2;
		int result=func.apply(10,20);
		System.out.println(result);
		
		//Bi Function
		
		BiFunction<Integer,Integer,Integer> func1= (x1,x2)->  x1+x2;
		int z=func1.apply(10, 30);
		System.out.println(z);
		
		//Unary Operator - single operand
		UnaryOperator<Integer> func2=x->x*2;
		int y=func2.apply(2);
		System.out.println(y);
		
		//Unary Operator extends Function interface
		Function<Integer,Integer> c=arg1->arg1*5;
		int result2=c.apply(10);
		System.out.println(result2);
		
		//Modify the data using Unary Operator
		List<String>longList= new ArrayList<String>();
		longList.add("Java");
		longList.add("Csharp");
		longList.add("perl");
		longList.add("Ruby");
		
		longList.replaceAll(ele->ele + "PrgLang");
		System.out.println(longList);
		
		
	}

}
