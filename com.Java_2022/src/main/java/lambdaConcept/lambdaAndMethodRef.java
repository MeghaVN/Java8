package lambdaConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import io.netty.handler.codec.http.HttpHeaders.Names;

public class lambdaAndMethodRef {
	
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("name1","name2","name3","name4");
		
		System.out.println("****Anonymous class************");
		//1. Anonymous class
		nameList.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		
		//2. using lambda exp
		System.out.println("*************Using Lambda**********");
		
		nameList.forEach(x->System.out.println(x));
		
		//3. method ref
		System.out.println("******method ref***********");
		
		nameList.forEach(System.out::println);
		
	}

}
