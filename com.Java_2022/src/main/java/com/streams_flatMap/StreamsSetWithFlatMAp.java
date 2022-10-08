package com.streams_flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetWithFlatMAp {
	
	public static void main(String[] args) {
		
		
		EmployeePojo emp1=new EmployeePojo();
		emp1.setName("Tom");
		emp1.addDevices("iphone8");
		emp1.addDevices("Poco");
		emp1.addDevices("nexus");
		emp1.addDevices("samsung");
		
		EmployeePojo emp2=new EmployeePojo();
		emp2.setName("Peter");
		emp2.addDevices("iphone10");
		emp2.addDevices("Poco");
		emp2.addDevices("nexus t1");
		emp2.addDevices("samsung galaxy");
		
		
		List<EmployeePojo> empList = new ArrayList<EmployeePojo>();
		empList.add(emp1);
		empList.add(emp2);
		
		List<String> devicesList = empList.stream()
				.map(x->x.getDevices())//map - returns stream of SetofString
				.flatMap(x->x.stream())// returns stream of string
				.distinct()
				.collect(Collectors.toList());
		
		devicesList.forEach(x->System.out.println(x));
		
				
	}

}
