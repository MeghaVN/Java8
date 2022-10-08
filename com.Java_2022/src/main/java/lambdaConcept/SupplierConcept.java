package lambdaConcept;

import java.util.function.Supplier;

public class SupplierConcept {
	public static void main(String[] args) {
		//Supplier don t take any input but returns a value
		getText(()->"Java");
		getText(()->"Naveen");
		getText(()->"Test Aut");
		
		
	}
	public static void getText(Supplier<String> text)
	{
		System.out.println(text.get());
	}

}
