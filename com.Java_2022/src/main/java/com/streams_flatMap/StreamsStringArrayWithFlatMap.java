package com.streams_flatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsStringArrayWithFlatMap {
	
	public static void main(String[] args) {
		
		String data[][]= new String[][] {{"a","b"},{"c","d"},{"e","f"}};
		
	Stream<String> finalStream=Arrays.stream(data)//convert 2- dimentional array to stream
			.flatMap(x->Arrays.stream(x)) //then apply flatMap
			.filter(x->"a".equals(x.toString()));//then apply filter on flatMap
	finalStream.forEach(System.out::println);
	
	}

}
