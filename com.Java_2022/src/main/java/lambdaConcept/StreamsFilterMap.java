package lambdaConcept;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsFilterMap {
	
	public static void main(String[] args) {
		
		List<CustomerPojo> customerList = Arrays.asList(
				new CustomerPojo(22, "Tom"),
				new CustomerPojo(44, "Steve"),
				new CustomerPojo(56, "Peter"),
				new CustomerPojo(67, "Jason"));
				String custName=customerList.stream()
						.filter(x->"Peter".equals(x.getCustomerName()))
						.map(CustomerPojo::getCustomerName)
						.findAny()
						.orElse(null);
				System.out.println(custName);
				System.out.println("********No Filter***********");
				List<String> custList=customerList.stream()
				.map(CustomerPojo::getCustomerName)
				.collect(Collectors.toList());
				custList.forEach(System.out::println);
	}

}
