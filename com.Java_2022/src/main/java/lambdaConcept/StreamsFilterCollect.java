package lambdaConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {
	
	public static void main(String[] args) {
		
	List<String> prodList = Arrays.asList("Macbook","iPhone","Shoes","battery","Fruits");
		System.out.println(prodList);
		
				List<String> result = prodList.stream().filter(ele->! ele.equals("iPhone")).collect(Collectors.toList());
				result.forEach(ele -> System.out.println(ele));
				System.out.println("*********Printing using method reference*******");
				result.forEach(System.out::println);
				
		
		
	}

}
