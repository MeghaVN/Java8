package lambdaConcept;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateConcept {

	public static void main(String[] args) {
		
		//filter accepts Predicate as argument
		Predicate<Integer> func = z-> z>5;
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,6,7,8,9,0);
		List<Integer> colist = list.stream().filter(func).distinct().collect(Collectors.toList());
		System.out.println(colist);
		
		//predicate with &&
		List<Integer> coList2=list.stream().filter(x-> x>2 && x<8).distinct().collect(Collectors.toList());
		System.out.println(coList2);
		
		//Predicate with Negate 
		List<String> list1 = Arrays.asList("Naveen","Navee","Java","Jav","Ja","J");
		Predicate<String> listWithNav = x->x.startsWith("Nav");
		List<String> negateList=list1.stream().filter(listWithNav.negate()).collect(Collectors.toList());
		System.out.println(negateList);
	}
	
}
