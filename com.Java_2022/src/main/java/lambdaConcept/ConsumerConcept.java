package lambdaConcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerConcept {
	
	public static void main(String[] args) {
		
		
		//It does not return anything 
		Consumer<String> func = x->System.out.println(x);
		func.accept("This is a consumer func..");
		
		//For each will accept consumer 
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,6,7,7,9,0,8);
		list.forEach(x->System.out.println(x));
	}

}
