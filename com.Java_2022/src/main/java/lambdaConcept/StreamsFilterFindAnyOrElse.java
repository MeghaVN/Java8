package lambdaConcept;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyOrElse {
	
	public static void main(String[] args) {
		
		
		
		
		//list of customers
		
		List<CustomerPojo> customerList = Arrays.asList(
				new CustomerPojo(22, "Tom"),
				new CustomerPojo(44, "Steve"),
				new CustomerPojo(56, "Peter"),
				new CustomerPojo(67, "Jason"));
		//x-> represents the list of all customers
		CustomerPojo custReference1 = customerList
		.stream() //convert list to stream
		.filter(x->"Perter".equals(x.getCustomerName())) //filter if ant Peter
		.findAny()//Find if any
		.orElse(null);//if Peter is not found return null
		//System.out.println(custReference.getAge()+" "+custReference.getCustomerName());//if Found
		System.out.println(custReference1);//if dint find
		
		
		//Filter with multiple conditions
		CustomerPojo custReference2 = customerList.stream()
					.filter((x)->"Tom".equals(x.getCustomerName())&& 22 ==x.getAge())
					.findAny()
					.orElse(null);
		
		System.out.println(custReference2.getAge()+" "+custReference2.getCustomerName());
		
	}
		
	
}
