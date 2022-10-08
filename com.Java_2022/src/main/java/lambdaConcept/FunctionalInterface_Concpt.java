package lambdaConcept;

import java.util.function.Function;

public class FunctionalInterface_Concpt {

	public static void main(String[] args) {

		Function<String, Integer> func = x -> x.length();
		Integer len = func.apply("This is java 8..");
		System.out.println(len);
		
		Function<Integer, Integer> funct2 = x->x*2;
		//System.out.println(funct2.apply(6));
		int result=func.andThen(funct2).apply("this is the length of the 2nd funct2..");
		System.out.println(result);
	}

}
